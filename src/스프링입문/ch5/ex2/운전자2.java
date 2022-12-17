package 스프링입문.ch5.ex2;

class 마티즈 extends 자동차 {

	@Override
	void 기어변속() {
		// 수동변속
	}

	@Override
	void 창문열기() {
		// 수동열기
	}

}

class 소나타 extends 자동차 {
	@Override
	void 기어변속() {
		// 자동열기
	}

	@Override
	void 창문열기() {
		// 자동열기
	}
}

public class 운전자2 {
	void 운전하기(자동차 car) {
		car.기어변속();
	}

	void 창문열기(자동차 car) {
		car.창문열기();
	}
}
