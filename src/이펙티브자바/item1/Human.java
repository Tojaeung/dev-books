package 이펙티브자바.item1;

public class Human {
    private String name;
    private int age;
    private int weight; // 몸무게
    
    // 생성자 시그니처가 같기 때문에 오류가 발생한다..
    // public Human(String name, int age) {
    //     this.name = name;
    //     this.age = age;
    // }
    //
    // public Human(String name, int weight) {
    //     this.name = name;
    //     this.weight = weight;
    // }

    public Human() {}
    
    // 같은 시크니처라도 컴파일 에러가 발생하지 않는다.
    public static Human fromAge(String name, int age) {
        Human human = new Human();
        human.age = age;
        return human;
    }
    // 같은 시크니처라도 컴파일 에러가 발생하지 않는다.
    public static Human fromWeight(String name, int weight) {
        Human human = new Human();
        human.weight = weight;
        return human;
    }
}
