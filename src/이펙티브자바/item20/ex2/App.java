package 이펙티브자바.item20.ex2;

public class App {
	public static void main(String[] args) {

		// 인터페이스 타입
		// 익명이너클래스 사용
		PersonInterface lazyPerson = new AbstractLazyPerson() {
			@Override
			void lazyBehavior() {
				System.out.println("잠자기...");
			}
		};

		lazyPerson.life();
	}
}