package test.builder;

//ConcreteBuilder��ʵ��Builder�Ľӿ��Թ����װ��ò�Ʒ�ĸ������������岢��ȷ���������ı�ʾ�����ṩһ��������Ʒ�Ľӿڡ�
//builder woman
public class WomanBuilder implements PersonBuilder {

	@Override
	public String buildHead() {
		return "����Ů�˵�ͷ��";

	}

	@Override
	public String buildBody() {
		return "����Ů�˵����壡";

	}

	@Override
	public String buildFoot() {
		return "����Ů�˵��ȣ�";

	}

}
