package test.builder;

//ConcreteBuilder：实现Builder的接口以构造和装配该产品的各个部件，定义并明确它所创建的表示，并提供一个检索产品的接口。
//build Man
public class ManBuilder implements PersonBuilder {

	@Override
	public String buildHead() {
		return "建造男人的头！";

	}

	@Override
	public String buildBody() {
		return "建造男人的身体！";

	}

	@Override
	public String buildFoot() {
		return "建造男人的腿！";

	}

}
