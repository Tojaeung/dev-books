package 이펙티브자바.item3.열거타입;

public enum Elvis {
    INSTANCE("경기도", 43), INSTANCE2("전라도", 33);

    private String homeTown;
    private int age;

    Elvis(String homeTown, int age) {
        this.homeTown = homeTown;
        this.age = age;
    }

    public String getHomeTown() {
        return this.homeTown;
    }

    public int getAge() {
        return this.age;
    }
}
