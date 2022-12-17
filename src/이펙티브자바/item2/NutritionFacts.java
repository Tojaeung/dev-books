package 이펙티브자바.item2;

public class NutritionFacts {

	private final int servingSize;
	private final int servings;
	private final int calories;
	private final int fat;
	private final int sodium;
	private final int carbohydrate;

	public static class Builder {

		// 필수 매개변수
		private final int servingSize;
		private final int servings;

		// 선택 매개변수 - 기본값으로 초기화한다.
		private int calories = 0;
		private int fat = 0;
		private int sodium = 0;
		private int carbohydrate = 0;

		// 필수 매개변수를 받는다.
		public Builder(int servingSize, int servings) {
			this.servingSize = servingSize;
			this.servings = servings;
		}

		public Builder calories(int val) {
			calories = val;
			return this;
		}

		public Builder fat(int val) {
			// 불변식 (이 클래스에 적절하지 않지만 예시로 만듬..)
			if (val < calories)
				throw new IllegalArgumentException("지방은 칼로리보다 커야합니다.");

			fat = val;
			return this;
		}

		public Builder sodium(int val) {
			sodium = val;
			return this;
		}

		public Builder carbohydrate(int val) {
			carbohydrate = val;
			return this;
		}

		public NutritionFacts build() {
			return new NutritionFacts(this);
		}
	}

	private NutritionFacts(Builder builder) {
		servingSize = builder.servingSize;
		servings = builder.servings;
		calories = builder.calories;
		fat = builder.fat;
		sodium = builder.sodium;
		carbohydrate = builder.carbohydrate;
	}

	public static void main(String[] args) {
		// 빌더패턴 사용예시
		NutritionFacts cocaCola = new NutritionFacts.Builder(240, 8)
				.calories(100)
				// .fat(0) 지방은 0으로 초기화 되어있다.
				.sodium(35)
				.carbohydrate(27)
				.build();
	}
}
