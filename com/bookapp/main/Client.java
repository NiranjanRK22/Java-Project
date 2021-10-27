package com.bookapp.main;

import com.bookapp.bean.Book;
import com.bookapp.exception.AuthorNotFoundException;
import com.bookapp.exception.CategoryNotFoundException;
import com.bookapp.service.BookImpl;
import com.bookapp.service.BookInter;

import java.util.List;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) throws AuthorNotFoundException, CategoryNotFoundException {
		// TODO Auto-generated method stub
        BookInter bookInter = new BookImpl();
        Scanner sc = new Scanner(System.in);
        for (int i=0; i<4; i++)  {
        	Book book = new Book();
            System.out.println("Enter title: ");
            String title = sc.next();
            book.setTitle(title);
            System.out.println("Enter author: ");
            String author = sc.next();
            book.setAuthor(author);
            System.out.println("Enter category: ");
            String category = sc.next();
            book.setCategory(category);
            System.out.println("Enter book id: ");
            int bookId = sc.nextInt();
            book.setBookId(bookId);
            System.out.println("Enter price: ");
            int price = sc.nextInt();
            book.setPrice(price);
            bookInter.addBook(book);
        }
        
        System.out.println(bookInter.getAllBooks());
        System.out.println("Enter the author name which you want to search: ");
        String authorToSearch = sc.next();
//        bookInter.getBookByAuthor(authorToSearch);
        List authorName = bookInter.getBookByAuthor(authorToSearch);
        if (!authorName.isEmpty())  {
        System.out.println(authorName);
        }
        else {
        	System.out.println("Data not found with given author name");
        }
        System.out.println("Enter the category which you want to search: ");
        String categoryToSearch = sc.next();
        List categoryName = bookInter.getBookByCategory(categoryToSearch);
        if (!categoryName.isEmpty())  {
            System.out.println(categoryName);
            }
            else {
            	System.out.println("Data not found with given category");
            }
	}
	

}
