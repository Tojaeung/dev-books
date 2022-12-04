package 이펙티브자바.item1.ch3_하위타입객체반환;

public interface Test {
    String getGrade();

    public static Test of(int score) {
        // Test의 하위객체인 상,중,하를 조건에 따라 반환하고 있다.
        if (score > 90) {
            return new 상();
        } else if (score > 80) {
            return new 중();
        } else {
            return new 하();
        }
    }
}
