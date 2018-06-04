package test.decorator;

//À±½·
public class Chilli extends Condiment {
	Humburger humburger;

	public Chilli(Humburger humburger) {
		this.humburger = humburger;
	}

	@Override
	public String getName() {

		return humburger.name + "£¬¼ÓÀ±½·";
	}

	@Override
	public double getPrice() {

		return humburger.getPrice(); // À±½·ÊÇÃâ·ÑµÄ
	}

}
