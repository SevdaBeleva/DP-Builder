package builder;
import java.time.LocalDate;

public class User {

	private String userName;
	
	private String password;
	
	private String firstName;
	
	private String lastName;
	
	private LocalDate dateOfBirth;
	
	private User(Builder builder) {
		this.userName = builder.userName;
		this.password = builder.password;
		this.firstName = builder.firstName;
		this.lastName = builder.lastName;
		this.dateOfBirth = builder.dateOfBirth;
	}
	
	@Override
	public String toString() {
		return "User [userName=" + userName + ", password=" + password + ", firstName=" + firstName + ", lastName="
				+ lastName + ", dateOfBirth=" + dateOfBirth + "]";
	}
	
	public static class Builder {
		
		private String userName;
		
		private String password;
		
		private String firstName;
		
		private String lastName;
		
		private LocalDate dateOfBirth;
		
		public Builder(String uName, String pass) {
			this.userName = uName;
			this.password = pass;
		}
		
		public Builder firstName(String fName) {
			this.firstName = fName;
			return this;
		}
		
		public Builder lastName(String lName) {
			this.lastName = lName;
			return this;
		}
		
		public Builder dateOfBirth(LocalDate bDate) {
			this.dateOfBirth = bDate;
			return this;
		}
		
		public User build() {
			return new User(this);
		}
		
	}

}
