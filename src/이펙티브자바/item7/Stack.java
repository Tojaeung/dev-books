package 이펙티브자바.item7;

import java.util.Arrays;
import java.util.EmptyStackException;

public class Stack {
	public Object[] elements;
	protected int size = 0;
	private static final int DEFAULT_INITIAL_CAPACITY = 4;

	public Stack() {
		elements = new Object[DEFAULT_INITIAL_CAPACITY];
	}

	public void push(Object e) {
		ensureCapacity();

		// push된 이후에 size 증가
		elements[size++] = e;
	}

	// 잘못된 예

	public Object pop() {
		if (size == 0)
			throw new EmptyStackException();

		// size 감소 후 반환
		return elements[--size];
	}

	// 올바른 예
	// public Object pop() {
	// if (size == 0)
	// throw new EmptyStackException();

	// Object result = elements[--size]; // 메모리 누수 !!
	// elements[size] = null;

	// // size 감소 후 반환
	// return result;
	// }

	private void ensureCapacity() {
		if (elements.length - 1 == size) {
			elements = Arrays.copyOf(elements, 2 * size + 1);
		}
	}

}
