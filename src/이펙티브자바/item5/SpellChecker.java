package 이펙티브자바.item5;

import java.util.Objects;

public class SpellChecker {
    private final Lexicon dictionary;

    // 의존 객체 주입 패턴
    // 유연성과 테스트가 용이하다.
    public SpellChecker(Lexicon dictionary) {
        this.dictionary = Objects.requireNonNull(dictionary);
    }

    public boolean isValid (String word){
  		// ...
  	}

    public List<String> suggetions (String type){
  		// ...
  	{
}
