package 스프링입문.ch6.ex1;

public abstract class Animal {
	protected String nama;

	public Animal(String nama) {
		this.nama = nama;
	}

	public abstract void cry();

}
