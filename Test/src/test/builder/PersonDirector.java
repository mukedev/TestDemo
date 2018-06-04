package test.builder;

//Director：构造一个使用Builder接口的对象，指导构建过程。
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
