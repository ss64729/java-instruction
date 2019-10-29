package ui;

import java.time.LocalDate;
import java.util.List;

import business.Actor;
import business.Movie;

import db.MovieDB;
import db.ActorDB;
import util.Console;

public class BMDBConsoleApp {

	private static MovieDB movieDB = new MovieDB();
	private static ActorDB actorDB = new ActorDB();

	public static void main(String[] args) {
		System.out.println("bmdb Console Menu");
		int choice = 0;
		while (choice != 99) {
			choice = Console.getInt(getMenu(), 0, 100);

			switch (choice) {
			case 1:
				// List Movies
				List<Movie> movies = movieDB.list();
				System.out.println("List of movies: ");
				for (Movie m : movies) {
					System.out.println(m);
				}
				break;
			case 2:
				// List Actors
				List<Actor> actors = actorDB.list();
				System.out.println("List of Actors: ");
				for (Actor a : actors) {
					System.out.println(a);
				}
				break;
			case 3:
				// Add Movie
				System.out.println("Add a movie: ");
				String title = Console.getString("Title:  ");
				String rating = Console.getString("Rating:  ");
				int year = Console.getInt("Year:  ");
				String director = Console.getString("Director:  ");
				Movie m = new Movie(title, rating, year, director);
				int rowCount = movieDB.addMovie(m);
				if (rowCount == 1) {
					System.out.println(rowCount + " rows affected.");
				} else {
					System.out.println("error adding movie");
				}

				break;
			case 4:
               // add Actor
				System.out.println("Add an actor: ");
				String firstName = Console.getString("First Name:  ");
				String lastName = Console.getString("Last Name:  ");
				String gender = Console.getString("gender:  ");

				String birth = Console.getString("dob using yyyy-mm-dd: ");
				LocalDate dob = LocalDate.parse(birth);
				Actor a = new Actor(firstName, lastName, gender, dob);
				int rc = actorDB.addActor(a);
				if (rc == 1) {
					System.out.println(rc + " rows affected.");
				} else {
					System.out.println("error adding actor");
				}
				break;
			case 5:
				// Update Movie
				m = getMovie();
				if (m != null) {
					int yr = Console.getInt("new year?");
					m.setYear(yr);
					rowCount = movieDB.updateMovie(m);
					if (rowCount == 1) {
						System.out.println(rowCount + " rows affected.");
					} else {
						System.out.println("error updating movie");
					}
				}
				break;
			case 6:
				// Update Actor
				System.out.println("update");
				a = getActor();

				if (a != null) {
					String lName = Console.getString("update Last Name?");
					a.setLastName(lName);
					rowCount = actorDB.updateActor(a);
					if (rowCount == 1) {
					System.out.println(rowCount + " rows updated");
				} else {
					System.out.println(" error updating actor");
				}
				}
				break;

			case 7:
				// delete Movie
				m = getMovie();
				if (m != null) {
					rowCount = movieDB.deleteMovie(m);
					if (rowCount == 1) {
						System.out.println(rowCount + " rows affected.");
					} else {
						System.out.println("error updating movie");
					}
				}
				break;
			case 8:
				// delete Actor
				System.out.println("delete");
				a = getActor();

				if (a != null) {
					rowCount = actorDB.deleteActor(a);
					if (rowCount == 1) {
					System.out.println(rowCount + "rows deleted");
				} else {
					System.out.println(" error deleting actor");
				}
				}
				break;

			case 9:
				// Get Movie
				m = getMovie();

				if (m != null) {
					System.out.println("Movie: " + m);
				} else {
					System.out.println(" movie not found");
				}

				break;
			case 10:
				// Get Actor
				System.out.println("get");
				a = getActor();

				if (a != null) {
					System.out.println("Actor: " + a);
				} else {
					System.out.println(" Actor not found");
				}

				break;

			case 99:
				// exit
				System.out.println("bye");
				break;
			default:
				System.out.println("Invalid Try again!");
				break;
			}

		}

	}

	private static Movie getMovie() {
		int id = Console.getInt("Id?", 0, Integer.MAX_VALUE);
		Movie m = movieDB.get(id);
		return m;
	}

	private static Actor getActor() {
		int id = Console.getInt("Id?", 0, Integer.MAX_VALUE);
		Actor a = actorDB.get(id);
		return a;
	}

	private static String getMenu() {
		String menu = "Command Options:\n" + "1 - List Movies\n" + "2 - List Actors\n" + "3 - Add Movie\n"
				+ "4 - Add Actor\n" + "5 - Update Movie\n" + "6 - Update Actor\n" + "7 - Delete Movie\n"
				+ "8 - Delete Actor\n" + "9 - Get Movie\n" + "10 - Get Actor\n" + "99- Exit\n" + "Command:  ";
		return menu;
	}
}
