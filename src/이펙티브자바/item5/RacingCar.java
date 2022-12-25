package 이펙티브자바.item5;

import java.util.Objects;

public class RacingCar implements Car {
	private static Long sequence = 0L;
	private String serial;
	private String name;

	public RacingCar(String serial, String name) {
		this.serial = serial;
		this.name = name;
	}

	public static RacingCar of(String name) {
		String generatedSerial = generateSerial(++sequence);
		return new RacingCar(generatedSerial, name);
	}

	private static String generateSerial(Long id) {
		return "Racing" + Objects.hashCode(id);
	}

	@Override
	public void move() {
		System.out.println("2배 속도 전진");
	}
}
