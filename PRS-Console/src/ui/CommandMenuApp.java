package ui;

import java.util.ArrayList;

import business.User;
import util.Console;

public class CommandMenuApp {

	public static void main(String[] args) {

		ArrayList<User> users = createUsers();
		System.out.println("PRS Console");
		String command = "";
		int userCnt = 2; // 2 people in user table will use this to increment the UserId to avoid dups
		while (!command.equals("6")) {
			command = Console.getString(getDisplayMenu());
			if (command.equals("1")) {
				showUsers(users);
			} else if (command.equals("2")) {
				selectUser(users);
			} else if (command.equals("3")) {
				userCnt = addUser(users, userCnt);
				// System.out.println("user count "+userCnt);
			} else if (command.equals("4")) {
				editUser(users);
			} else if (command.equals("5")) {
				deleteUser(users);
			} else if (command.equals("6")) {
				// user chose exit
				System.out.println("bye");
			} else
				System.out.println("try again");
		}

	} // End Main

	private static void editUser(ArrayList<User> users) {
		String uName = "";
		String uPassword = "max129";
		uName = Console.getString("Enter User Name ");

		for (User u : users) {
			if (u.getUserName().equals(uName)) {
				System.out.println(u);
				// int idx = users.indexOf(u);
				uPassword = Console.getString("Update Password: ");
				if (!u.getPassword().equals(uPassword)) {
					// System.out.println(u.getPassword());
					u.setPassword(uPassword);
					System.out.println(u);
				}
			}
		}
	}

	private static int addUser(ArrayList<User> users, int userCnt) {
		String uName = Console.getString("Enter User Name: ");
		String fName = Console.getString("Enter First Name: ");
		String lName = Console.getString("Enter Last Name: ");
		String pNum = Console.getString("Enter Phone Number: ");
		String eMail = Console.getString("Enter email: ");
		userCnt++;

		User u3 = new User(userCnt, uName, "max129", fName, lName, pNum, eMail, 0, 0);
		users.add(u3);
		showUsers(users);
		return userCnt;
	}

	private static void deleteUser(ArrayList<User> users) {
		for (int i = 0; i < users.size(); i++) {
			System.out.println((i + 1) + ". " + users.get(i));
		}
		int delUser = Console.getInt("Enter Number you want to delete ");
		if (delUser > users.size()) {
			System.out.println("Number not available");
		} else {
			users.remove(delUser - 1);
		}
	}

	private static void selectUser(ArrayList<User> users) {
		String uName = "";
		uName = Console.getString("Enter User Name ");

		for (User u : users) {
			if (u.getUserName().equals(uName)) {
				System.out.println(u);
			}
		}
		System.out.println("No user match.");
	}

	private static void showUsers(ArrayList<User> users) {
		for (User u : users) {
			System.out.println(u);
		}
	}

	private static ArrayList<User> createUsers() {

		// When I put the 0 in for isReviewer is when it prompted me to change from
		// boolean to int. I also tried it in quotes. At one point I put false and it
		// still didn't like it.

		User u1 = new User(1, "ss64729", "max129", "Sarah", "Sizemore", "513-222-2323", "sarah.sizemore@test.com", 0,
				0);
		User u2 = new User(2, "ss12345", "max129", "Susan", "Smith", "513-222-1222", "susan.smith@test.com", 0, 0);
		ArrayList<User> users = new ArrayList<>();
		users.add(u1);
		users.add(u2);
		return users;
	}

	private static String getDisplayMenu() {
		String menu = "\nCOMMAND MENU\n" + "1- List Users\n" + "2- Get a User\n" + "3- Add a User \n"
				+ "4- Edit a User\n" + "5- Delete a User\n" + "6- Exit program\n" + "\n" + "Command: \r\n";
		return menu;
	}

}
