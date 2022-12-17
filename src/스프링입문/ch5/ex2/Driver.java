package 스프링입문.ch5.ex2;

// 개방 폐쇄 원칙 위반 예시
public class Driver {
	void 운전하기(Matiz matiz) {
		matiz.기어수동변속();
	}

	void 창문열기(Matiz matiz) {
		matiz.창문수동열기();
	}
}
