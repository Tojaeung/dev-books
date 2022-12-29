package 이펙티브자바.item18.ex3;

import java.util.List;
import java.util.TreeSet;

public class App {
	public static void main(String[] args) {
		InstrumentedHashSet<String> s = new InstrumentedHashSet<>(new TreeSet<>());
		s.addAll(List.of("A", "B", "C"));
		System.out.println("s.getAddCount() = " + s.getAddCount()); // 결과는 3
	}
}
