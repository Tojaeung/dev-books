package 이펙티브자바.item20.ex2;

public interface PersonInterface {
	void study();

	void eat();

	default void life() {
		for (int i = 0; i < 3; i++) {
			eat();
			study();
		}
	}
}
