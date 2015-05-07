package javaee.jpa.hibernate.example1;

public class Client {
	public static String getFirstName() {
		PersonDao dao = new PersonDao();
		return dao.findPersonById(1).getFirstname();
	}
	
	public static void main(String[] args) {
		System.out.println(getFirstName());
	}	
}
