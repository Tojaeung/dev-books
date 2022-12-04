package 이펙티브자바.item1.ch4_상속불가;

public class Student {
    private String name;

    // 외부에서 생성자 사용방지를 위해 private사용
    private Student() {}

    public static Student fromName(String name) {
        Student student = new Student();
        student.name = name;
        return student;
    }

}
