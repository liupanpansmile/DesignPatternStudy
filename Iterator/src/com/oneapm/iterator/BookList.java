package com.oneapm.iterator;

import java.util.ArrayList;
import java.util.List;

public class BookList<E> implements IBookList {

	
	private List<E> list = new ArrayList<E>() ;
	
	public void addBook(E book)
	{
		list.add(book) ;
	}
	
	public E getBook(int index)
	{
		if(index >= list.size() || index <0)
			return null;
		return list.get(index) ;
	}
	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return new BookListIterator(this);
	}
	
	public int size()
	{
		return list.size() ;
	}

	
}
