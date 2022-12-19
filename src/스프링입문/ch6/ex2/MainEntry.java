package 스프링입문.ch6.ex2;

public class MainEntry {

	public static void main(String[] args) {
		Display display = new BufferDisplay(3);

		display.print("fewwwwwwwwwwwwwww");
		display.print("fewwwwwwwwwwwwwww");
		display.print("fewwwwwwwwwwwwwww");
		display.print("fewwwwwwwwwwwwwww");
		display.print("fewwwwwwwwwwwwwww");

		((BufferDisplay) display).flush(); // 다운캐스팅(수동)
	}
}
