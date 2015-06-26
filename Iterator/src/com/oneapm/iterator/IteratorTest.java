package com.oneapm.iterator;

public class IteratorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BookList<Book> list = new BookList<Book>() ;
		
		list.addBook(new Book("novel"));
		list.addBook(new Book("Chinese"));
		list.addBook(new Book("English"));
		
		Iterator<Book> iterator = list.iterator() ;
		
		while(iterator.hasNext())
		{
			System.out.println( iterator.next().getName());
		}
		
	}

}
