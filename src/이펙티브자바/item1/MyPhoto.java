package 이펙티브자바.item1;

public class MyPhoto {
    // 인스턴스는 불변이고 생성비용이 크기 때문에 미리 만들어두었다.
    private static final MyPhoto myPhoto = new MyPhoto("엄청긴이름");

    private String name; // 엄청 긴 이름
    
    private MyPhoto(String name) {
        this.name = name;
    }

    // 정적 팩토리 메서드
    public static MyPhoto getInstance() {
        // 미리 만들어둔 인스턴스 반환
        return myPhoto;
    }
}
