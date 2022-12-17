package 이펙티브자바.item1.ch2_인스턴스생성제어;

public class Photo {
  // 지역 변수들........

  public Photo() {}

  public static final Photo instance = new Photo();
  public static Photo singleton = null;

  // 미리 만들어진 인스턴스만을 리턴 (인스턴스화 불가)
  public static Photo getInstance() {
    return instance;
  }

  // 단 하나의 인스턴스만을 생성해서 리턴(싱글톤)
  public static Photo getSingleton() {
    if (singleton == null) {
      singleton = new Photo();
    }
    return singleton;
  }
}


