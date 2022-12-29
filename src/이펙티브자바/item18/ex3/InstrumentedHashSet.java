package 이펙티브자바.item18.ex3;

import java.util.Collection;
import java.util.Set;

class InstrumentedHashSet<E> {
	// 중복상관없이 추가된 멤버 수를 알고 싶어서인듯??
	private int addCount = 0;

	// ex2와 같이 데코레이터 패턴(래퍼클래스) 사용안하고 컴포지션만 사용
	private final Set<E> s;

	public InstrumentedHashSet(Set<E> set) {
		this.s = set;
	}

	public boolean add(E e) {
		addCount++;
		return s.add(e);
	}

	public boolean addAll(Collection<? extends E> c) {
		addCount += c.size();
		return s.addAll(c);
	}

	public int getAddCount() {
		return addCount;
	}

}
