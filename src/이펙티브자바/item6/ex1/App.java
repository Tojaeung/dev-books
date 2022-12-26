package 이펙티브자바.item6.ex1;

public class App {
	public static void main(String[] args) {
		// 새로운 객체생성
		String str = new String("나다호다");
		String str2 = new String("나다호다");
		String str3 = new String("나다호다");

		System.out.println(str == str2); // false
		System.out.println(str2 == str3);// false
		System.out.println(str == str3);// false

		// 문자열 리터럴 같다고 객체 공유
		String str10 = "나다호다";
		String str20 = "나다호다";
		String str30 = "나다호다";

		System.out.println(str10 == str20);// true
		System.out.println(str20 == str30);// true
		System.out.println(str10 == str30);// true
	}
}
