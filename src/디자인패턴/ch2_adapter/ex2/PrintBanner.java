package 디자인패턴.ch2_adapter.ex2;

// 위임을 통한 어댑터패턴
public class PrintBanner extends Print {
	private Banner banner;

	public PrintBanner(String string) {
		this.banner = new Banner(string);
	}

	@Override
	public void printWeak() {
		banner.showWithParen();
	}

	@Override
	public void printStrong() {
		banner.showWithAster();
	}
}
