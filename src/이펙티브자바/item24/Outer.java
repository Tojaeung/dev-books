package 이펙티브자바.item24;

public class Outer {
	private int re = 2;

	private void hello2() {
		System.out.println("안녕");
	}

	static class Inner {
		void hello() {
			System.out.println(re);
			hello2();
		}
	}
}
