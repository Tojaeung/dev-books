package 이펙티브자바.item3.final필드방식;

public class Elvis {
	public static final Elvis INSTANCE = new Elvis();

	// 생성자 생성 막음
	private Elvis() {
	}
}
