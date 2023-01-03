package 이펙티브자바.item24;

import 이펙티브자바.item24.Outer.Inner;

public class App {
	public static void main(String[] args) {
		Outer outer = new Outer();

		// 관계정보 메모리에 저장
		// 생성시간 오래걸림
		Inner inner = outer.new Inner();
		inner.hello();
	}
}