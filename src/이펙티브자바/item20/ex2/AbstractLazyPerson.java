package 이펙티브자바.item20.ex2;

public abstract class AbstractLazyPerson implements PersonInterface {
	abstract void lazyBehavior();

	@Override
	public void study() {
		System.out.println("공부...");
	}

	@Override
	public void eat() {
		System.out.println("밥 먹기...");
	}

}
