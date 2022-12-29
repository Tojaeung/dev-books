package 디자인패턴.ch5_싱글톤패턴.ex2;

public class App {
	public static void main(String[] args) {
		System.out.println("Start");
		Singleton singleton = Singleton.INSTANCE;
		Singleton singleton2 = Singleton.INSTANCE;
		if (singleton == singleton2) {
			System.out.println("singleton과 singleton2는 같은 인스턴스입니다.");
		} else {
			System.out.println("singleton과 singleton2는 같은 인스턴스가 아닙니다.");
		}
		System.out.println("End");
	}
}
