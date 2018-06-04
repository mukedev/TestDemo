package test.decorator;

public class Chilli2 extends Condiment {
	Humburger humburger;

	public Chilli2(Humburger humburger) {
		this.humburger = humburger;
	}

	@Override
	public String getName() {

		return humburger.name + "�������ˣ�������";
	}

	@Override
	public double getPrice() {

		return humburger.getPrice() + 1.5;
	}

}
