package 디자인패턴.ch2_어댑터.ex1;

// 상속을 통한 어댑터 패턴
public class PrintBanner extends Banner implements Print {
	public PrintBanner(String string) {
		super(string);
	}

	@Override
	public void printWeak() {
		showWithParen(); // 상위 클래스 배너의 메서드
	}

	@Override
	public void printStrong() {
		showWithAster(); // 상위 클래스 배너의 메서드
	}
}
