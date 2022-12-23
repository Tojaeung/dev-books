package 이펙티브자바.item3.ex1;

// 정적 필드 방법
public class Elvis {
	// public, protected 생성자가 없으므로 초기화 될때 하나뿐인 객체라는 보장
	public static final Elvis INSTANCE = new Elvis();

	private Elvis() {
	}

}
