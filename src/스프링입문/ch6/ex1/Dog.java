package 스프링입문.ch6.ex1;

public class Dog extends Animal {
	public Dog(String name) {
		super(name);
	}

	@Override
	public void cry() {
		System.out.println("멍멍");
	}
}
