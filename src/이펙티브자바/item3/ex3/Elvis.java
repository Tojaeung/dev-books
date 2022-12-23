package 이펙티브자바.item3.ex3;

import java.io.Serializable;

public class Elvis implements Serializable {
	public static final Elvis INSTANCE = new Elvis();

	private Elvis() {
	}

	// 역직렬화에서 readObject메서드 실행시, 새로운 객체생성을 막는다.
	// 그러나, 다른 필드들을 모두 transiet선언해줘야한다. (귀찮음, 보안문제 있음)
	private Object readResolve() {
		return INSTANCE;
	}
}
