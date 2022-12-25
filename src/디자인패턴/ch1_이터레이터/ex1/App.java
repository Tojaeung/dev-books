package 디자인패턴.ch1_이터레이터.ex1;

import java.util.Iterator;

public class App {
	public static void main(String[] args) {

		// jcf는 iterator인터페이스가 구현되어있다.
		// 따로 구현안하고 바로 사용하면됨

		BookShelf bookShelf = new BookShelf(4);
		bookShelf.appendBook(new Book("Around the World in 80 Days"));
		bookShelf.appendBook(new Book("Bible"));
		bookShelf.appendBook(new Book("Cinderella"));
		bookShelf.appendBook(new Book("Daddy-Long-Legs"));

		// 명시적으로 Iterator를 사용하는 방법
		Iterator<Book> it = bookShelf.iterator(); // 재사용,유지보수위해 인터페이스 상위타입 선언
		while (it.hasNext()) {
			Book book = it.next();
			System.out.println(book.getName());
		}
		System.out.println();

		// 확장 for문을 사용하는 방법
		for (Book book : bookShelf) {
			System.out.println(book.getName());
		}
		System.out.println();
	}
}
