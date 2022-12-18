package 스프링입문.ch6.ex1;

public class Cat extends Animal {
	public Cat(String nama) {
		super(nama);
	}

	@Override
	public void cry() {
		System.out.println("야옹");
	}
}
