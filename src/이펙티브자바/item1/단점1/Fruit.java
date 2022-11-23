package 이펙티브자바.item1.단점1;

public class Fruit {
    private String name;

    // 외부에서 인스턴스 생성 못하게 한다.
    // 상속을 못해서 확장할 수 없는 단점이 있다.
    // private Fruit() {}
    
    public static Fruit fromFruit(String name) {
        Fruit fruit = new Fruit();
        fruit.name = name;
        return fruit;
    }
}
