package builder;
public class App {

	public static void main(String[] args) {
		User websiteUser = new User.Builder("emo", "12345").firstName("Emil").build();
		
		System.out.println(websiteUser);
	}

}
