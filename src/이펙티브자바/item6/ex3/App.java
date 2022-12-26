package 이펙티브자바.item6.ex3;

public class App {
	private static long sum() {
		// 오토박싱으로 계속 Wrapper 클래스 Long객체가 생성된다.
		// 그것도 2의 31제곱이나...ㄷㄷ;;;
		Long sum = 0L;
		for (long i = 0; i <= Integer.MAX_VALUE; i++)
			sum += i;
		return sum;
	}

	public static void main(String[] args) {

	}
}
