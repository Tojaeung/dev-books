package 스프링입문.ch6.ex1;

public class Bird {
	private String name;

	void setName(String name) {
		this.name = name;
	}

	String getName() {
		return name;
	}

	void sound() {
		System.out.println("짹짹");
	}
}
