package test.builder;

//ConcreteBuilder��ʵ��Builder�Ľӿ��Թ����װ��ò�Ʒ�ĸ������������岢��ȷ���������ı�ʾ�����ṩһ��������Ʒ�Ľӿڡ�
//build Man
public class ManBuilder implements PersonBuilder {

	@Override
	public String buildHead() {
		return "�������˵�ͷ��";

	}

	@Override
	public String buildBody() {
		return "�������˵����壡";

	}

	@Override
	public String buildFoot() {
		return "�������˵��ȣ�";

	}

}
