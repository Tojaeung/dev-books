package 스프링입문.ch6.ex2;

public class ScreenDisplay implements Display {
	@Override
	public void print(String content) {
		try {
			Thread.sleep(1000); // 메서드 수행이 오래걸린다고 가정...
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println(content);
	}
}
