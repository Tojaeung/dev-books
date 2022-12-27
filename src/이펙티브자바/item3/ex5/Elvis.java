package 이펙티브자바.item3.ex5;

public enum Elvis {
	INSTANCE("엘비스", 54);

	private String name;
	private int age;

	private Elvis(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
}