package 이펙티브자바.item18.ex2;

import java.util.List;
import java.util.TreeSet;

public class App {
	public static void main(String[] args) {
		InstrumentedSet<String> s = new InstrumentedSet<>(new TreeSet<>());
		s.addAll(List.of("A", "B", "C"));
		System.out.println("s.getAddCount() = " + s.getAddCount()); // 3
	}
}
