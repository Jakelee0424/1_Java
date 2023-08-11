package edu.kh.book.run;

import edu.kh.book.model.service.BookService;

public class Run {
	public static void main(String[] args) {
		
		BookService service = new BookService();
		service.displayMenu();
	}
}
