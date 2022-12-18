package 스프링입문.ch6.ex1;

import java.util.ArrayList;

public class App {
	public static void main(String[] args) {
		ArrayList<Animal> animals = new ArrayList<>();
		animals.add(new Dog("개"));
		animals.add(new Cat("야옹이"));
		animals.add(new BirdAdapter("참새"));

		animals.forEach(animal -> {
			animal.cry(); // 멍멍, 야옹, 짹짹
		});
	}
}
