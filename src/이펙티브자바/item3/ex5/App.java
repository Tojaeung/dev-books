package 이펙티브자바.item3.ex5;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

// 열거타입 싱글톤 리플렉션 사용
public class App {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException,
			IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		Elvis elvis = Elvis.INSTANCE;

		System.out.println(elvis.getAge()); // 54
		System.out.println(elvis.getName()); // 엘비스

		Class<?> elvisClass = Elvis.class;
		Constructor<?> declaredConstructor = elvisClass.getDeclaredConstructor(); // NoSuchMethodException
		declaredConstructor.setAccessible(true);
		Elvis elvis2 = (Elvis) declaredConstructor.newInstance();

		System.out.println(Elvis.INSTANCE == elvis2); // 생성자 못가지고온다. 에러...
	}
}
