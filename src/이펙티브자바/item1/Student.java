package 이펙티브자바.item1;

public class Student {
    private String name;
    private int age;
    private Boolean isMale; // 여자인지 남자인지 

    public Student() {}
    
    // 남자 성별의 student 인스턴스를 만든다.
    public static Student fromMale(Boolean isMale) {   // true
        Student student = new Student();
        student.isMale = isMale;
        return student;
    }

    // 여자 성별의 student 인스턴스를 만든다.
    public static Student fromFemale(Boolean isMale) {  // false
        Student student = new Student();
        student.isMale = isMale;
        return student;
    }

    public static void main(String[] args) {
        Student maleStudent = Student.fromMale(true);
        Student femaleStudent = Student.fromMale(false);
    }
}
