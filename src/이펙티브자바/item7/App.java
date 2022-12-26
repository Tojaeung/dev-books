package 이펙티브자바.item7;

import java.util.Arrays;

public class App {
	public static void main(String[] args) {

		Stack stack = new Stack();
		stack.push(new Person(31, "나다호다"));
		stack.push(new Person(32, "나다호다2"));
		stack.push(new Person(33, "나다호다3"));

		stack.pop();
		stack.pop();

		System.out.println(Arrays.toString(stack.elements));
	}
}
