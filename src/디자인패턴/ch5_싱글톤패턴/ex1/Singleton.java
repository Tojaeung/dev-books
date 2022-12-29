package 디자인패턴.ch5_싱글톤패턴.ex1;

public class Singleton {
	private static Singleton singleton = new Singleton();

	// static멤버변수 singleton이 getInstance가 호출된 이후에 초기화된다.
	private Singleton() {
		System.out.println("인스턴스를 생성했습니다.");
	}

	public static Singleton getInstance() {
		return singleton;
	}
}
