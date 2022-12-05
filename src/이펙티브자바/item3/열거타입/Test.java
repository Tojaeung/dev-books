package 이펙티브자바.item3.열거타입;

public class Test {
    public static void main(String[] args) {
        Elvis instance = Elvis.INSTANCE;
        Elvis instance2 = Elvis.INSTANCE;
        // 두 인스턴스의 객체 주소값이 똑같은걸 알 수 있다..
        if (instance == instance2) { // 결과: true
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
