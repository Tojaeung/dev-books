package 이펙티브자바.item4;

public class Util {
    public static int age = 32;

    // 인스턴스화 방지를 위해 private 생성자
    private Util() {
        // 클래스 안에서라도 실수로 인스턴스 생성을 막아주는 역할을 한다.
        throw new AssertionError();
    }
}
