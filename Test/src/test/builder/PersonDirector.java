package test.builder;

//Director������һ��ʹ��Builder�ӿڵĶ���ָ���������̡�
public class PersonDirector {
	PersonBuilder pb;

	public PersonDirector(PersonBuilder pb) {
		this.pb = pb;
	}

	public Person constructPerson() {
		Person person = new Person();
		person.setHead(pb.buildHead());
		person.setBody(pb.buildHead());
		person.setFoot(pb.buildHead());

		return person;
	}
}
