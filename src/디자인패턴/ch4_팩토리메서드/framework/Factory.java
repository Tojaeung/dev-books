package framework;

public abstract class Factory {
	// 오버라이드해서 재정의 하지마라
	public final Product create(String owner) {
		Product p = createProduct(owner);
		registerProduct(p);
		return p;
	}

	protected abstract Product createProduct(String owner);

	protected abstract void registerProduct(Product product);
}
