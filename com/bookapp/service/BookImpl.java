package com.bookapp.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.bookapp.bean.Book;
import com.bookapp.exception.*;


public class BookImpl implements BookInter {
    List<Book> bookList = new ArrayList<>();
    List<Book> updatedAuthorList = new ArrayList<>();
    List<Book> updatedCategoryList = new ArrayList<>();
    
	@Override
	public void addBook(Book book) {
		// TODO Auto-generated method stub
		bookList.add(book);
		//System.out.println(bookList);
		
	}
	
	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		Collections.sort(bookList, (book1, book2)  -> {
			return book1.getTitle().compareTo(book2.getTitle());
		});
		return bookList;
		
	}

	@Override
	public List<Book> getBookByAuthor(String author) throws AuthorNotFoundException {
		// TODO Auto-generated method stub5
		try  {
			for (Book book : bookList)  {
				if (book.getAuthor().equalsIgnoreCase(author))  {
					updatedAuthorList.add(book);
				}
//				else {
//					throw new  AuthorNotFoundException();
//				}
			}
			if (updatedAuthorList.size() == 0)  {
				throw new  AuthorNotFoundException();
			}
		}
		catch (AuthorNotFoundException e) {
		    	System.out.println(e.getMessage());
		}
		Collections.sort(updatedAuthorList, (book1, book2) ->  {
			return book1.getAuthor().compareTo(book2.getAuthor());
		});
		return updatedAuthorList;
	}

	@Override
	public List<Book> getBookByCategory(String category) throws CategoryNotFoundException {
		// TODO Auto-generated method stub
		try  {
			for (Book book : bookList)  {
				if (book.getCategory().equalsIgnoreCase(category))  {
					updatedCategoryList.add(book);
				}
//				else {
//					throw new  AuthorNotFoundException();
//				}
			}
			if (updatedCategoryList.size() == 0)  {
				throw new  CategoryNotFoundException();
			}
		}
		catch (CategoryNotFoundException e) {
		    	System.out.println(e.getMessage());
		}
		Collections.sort(updatedCategoryList, (book1, book2) ->  {
			return book1.getCategory().compareTo(book2.getCategory());
		});
		return updatedCategoryList;
	}

}
