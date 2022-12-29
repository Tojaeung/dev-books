package 이펙티브자바.item18.ex1;

import java.util.List;

public class App {
	public static void main(String[] args) {
		InstrumentedHashSet<String> s = new InstrumentedHashSet<>();
		s.addAll(List.of("A", "B", "C")); // 3개 추가했는데
		System.out.println("s.getAddCount() = " + s.getAddCount()); // 결과는 6??
	}
}
