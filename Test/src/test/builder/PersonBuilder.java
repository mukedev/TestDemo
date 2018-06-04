package test.builder;

//为创建一个产品对象的各个部件指定抽象接口。
public interface PersonBuilder {

	String buildHead();

	String buildBody();

	String buildFoot();

}
