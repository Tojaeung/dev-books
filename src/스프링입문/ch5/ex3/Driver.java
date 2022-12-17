package 스프링입문.ch5.ex3;

// 개방 폐쇄의 원칙
public class Driver {
	// 운전자는 주변의 환경 변화에 폐쇄적이다.
	void 운전하기(Car car) {
		car.기어변속();
	}

	void 창문열기(Car car) {
		car.창문열기();
	}
}
