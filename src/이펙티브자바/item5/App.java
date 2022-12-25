package 이펙티브자바.item5;

import java.util.List;

public class App {
	public static void main(String[] args) {
		List<Car> cars = CarFactory.create(() -> RacingCar.of("K5"), 3);

		System.out.println("cars = " + cars);
	}
}
