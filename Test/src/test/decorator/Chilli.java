package test.decorator;

//����
public class Chilli extends Condiment {
	Humburger humburger;

	public Chilli(Humburger humburger) {
		this.humburger = humburger;
	}

	@Override
	public String getName() {

		return humburger.name + "��������";
	}

	@Override
	public double getPrice() {

		return humburger.getPrice(); // ��������ѵ�
	}

}
