package 이펙티브자바.item3.ex2;

import java.lang.reflect.Constructor;

public class App {
	public static void main(String[] args) throws Exception {

		Class<?> elvisClass = Elvis.class;

		Constructor<?> declaredConstructor = elvisClass.getDeclaredConstructor();

		// private 생성자 접근 허용
		declaredConstructor.setAccessible(true);

		Elvis elvis = (Elvis) declaredConstructor.newInstance();

		// 리플렉션으로 싱글톤 패턴 무너짐
		System.out.println(Elvis.INSTANCE == elvis); // false
	}
}
