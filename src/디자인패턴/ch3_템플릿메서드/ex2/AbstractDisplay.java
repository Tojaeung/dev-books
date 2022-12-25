package 디자인패턴.ch3_템플릿메서드.ex2;

// 인터페이스 이용
public interface AbstractDisplay {
	// open, print, close는 하위 클래스에 구현을 맡기는 추상 메소드
	void open();

	void print();

	void close();

	// display는 AbstractDisplay에서 구현하는 메소드
	default void display() {
		open();
		for (int i = 0; i < 5; i++) {
			print();
		}
		close();
	}
}
