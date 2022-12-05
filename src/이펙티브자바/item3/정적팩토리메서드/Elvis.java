package 이펙티브자바.item3.정적팩토리메서드;

public class Elvis {
    // private으로 Elvis클래스 내에서만 사용할 수 있다.
    private static final Elvis INSTANCE = new Elvis();

    // 생성자 생성 막음
    private Elvis() {
    };

    public static Elvis getInstance() {
        return INSTANCE;
    }
}
