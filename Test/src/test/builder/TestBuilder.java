package test.builder;

public class TestBuilder {
	public static void main(String[] args) {
		PersonDirector pd = new PersonDirector(new WomanBuilder());
		Person womanPerson = pd.constructPerson();
		System.out.println(womanPerson.toString());
		
		PersonDirector pd1 = new PersonDirector(new ManBuilder());
		Person manPerson = pd1.constructPerson();
		System.out.println(manPerson.toString());

	}
}
