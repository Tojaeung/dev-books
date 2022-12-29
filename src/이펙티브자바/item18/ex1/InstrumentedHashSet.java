package 이펙티브자바.item18.ex1;

import java.util.Collection;
import java.util.HashSet;

class InstrumentedHashSet<E> extends HashSet<E> {
	// 중복상관없이 추가된 멤버 수를 알고 싶어서인듯??
	private int addCount = 0;

	public InstrumentedHashSet() {
	}

	public InstrumentedHashSet(int initCap, float loadFactor) {
		super(initCap, loadFactor);
	}

	@Override
	public boolean add(E e) {
		addCount++;
		return super.add(e);
	}

	@Override
	public boolean addAll(Collection<? extends E> c) {
		addCount += c.size();
		return super.addAll(c);
	}

	public int getAddCount() {
		return addCount;
	}

}
