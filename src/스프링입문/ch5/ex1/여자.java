package 스프링입문.ch5.ex1;

// 단일 책임 원칙에 위배되는 예
public class 여자 {

	// 아내의 역할
	private void 설거지하기() {
	}

	// 아내의 역할
	private void 빨래하기() {
	}

	// 회사 사원 역할
	private void 회계업무() {
	}

	// 회사 사원 역할
	private void 관리업무() {
	}
}
