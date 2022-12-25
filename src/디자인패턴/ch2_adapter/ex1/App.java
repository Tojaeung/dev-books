package 디자인패턴.ch2_adapter.ex1;

public class App {
	public static void main(String[] args) {

		// 타겟인 배너는 흑막에 가려져있다.
		// 배너 유지보수시, 코드에 아무런 영향이 없다.

		Print p = new PrintBanner("Hello");
		p.printWeak();
		p.printStrong();
	}
}
