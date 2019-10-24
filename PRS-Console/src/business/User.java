package business;
// Hi Sean!  I originally wrote this with the isReviewer and isAdmin as boolean.   
//  When I tried to assign data to it, it prompted me with an error telling me to change it to int.
//  So I just commented out the boolean things.  I'm guessing there is some sort of rule I am missing.

public class User {
	private int userId;
	private String userName;
	private String password;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String email;
//	private boolean isReviewer;
//	private boolean isAdmin;
	private int isReviewer;
	private int isAdmin;
	
	public User() {
		super();
	}


	public User(int userId, String userName, String password, String firstName, String lastName, String phoneNumber,
			String email, int i, int j) {
	//		String email, boolean i, boolean j) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.isReviewer = i;
		this.isAdmin = j;
	}


	public int getUserId() {
		return userId;
	}


	public void setUserId(int userId) {
		this.userId = userId;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


//	public boolean isReviewer() {
//		return isReviewer;
//	}


//	public void setReviewer(boolean isReviewer) {
//		this.isReviewer = isReviewer;
//	}


//	public boolean isAdmin() {
//		return isAdmin;
//	}


//	public void setAdmin(boolean isAdmin) {
//		this.isAdmin = isAdmin;
//	}


	public int getIsReviewer() {
		return isReviewer;
	}


	public void setIsReviewer(int isReviewer) {
		this.isReviewer = isReviewer;
	}


	public int getIsAdmin() {
		return isAdmin;
	}


	public void setIsAdmin(int isAdmin) {
		this.isAdmin = isAdmin;
	}


	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", password=" + password + ", firstName="
				+ firstName + ", lastName=" + lastName + ", phoneNumber=" + phoneNumber + ", email=" + email
				+ ", isReviewer=" + isReviewer + ", isAdmin=" + isAdmin + "]";
	}
	
	

}
