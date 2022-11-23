package 이펙티브자바.item1.장점3;

public interface Grade {
    String getGrade();

    // 자바8 이전에는 인터페이스에 정적 팩토리 메서드를 만들 수 없었다.
    public static Grade of(int score) {
        if (score > 90) {
            return new A();
        } else if (score > 80) {
            return new B();
        } else {
            return new C();
        }
    }
}
