package 스프링입문.ch6.ex1;

public class BirdAdapter extends Animal {
	private Bird bird = new Bird();

	public BirdAdapter(String name) {
		super(name);
		bird.setName(name);
	}

	@Override
	public void cry() {
		bird.sound();
	}

}
