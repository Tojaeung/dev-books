package 디자인패턴.ch2_어댑터.ex2;

public class App {
	public static void main(String[] args) {
		Print p = new PrintBanner("Hello");
		p.printWeak();
		p.printStrong();
	}
}
