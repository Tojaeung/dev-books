package 이펙티브자바.item1.ch1_이름소유;

public class Student {
    private String name;
    private int age;
    private int classroom;

    // 이름을 가진 정적 팩토리 메서드
    public static Student fromName(String name) {
        Student student = new Student();
        student.name = name;
        return student;
    }

    // 생성자 시그니처 제약없음
    public static Student fromAge(int age) {
        Student student = new Student();
        student.age = age;
        return student;
    }

    // 생성자 시그니처 제약없음
    public static Student fromClassroom(int classroom) {
        Student student = new Student();
        student.classroom = classroom;
        return student;
    }
}
