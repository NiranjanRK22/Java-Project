package com.bookapp.bean;

public class Book {
       String title;
       int bookId;
       String author;
       int price;
       String category;
       
       
       public String getTitle()  {
    	   return title;
       }
       
       public void setTitle(String title)  {
    	   this.title = title;
       }
       public String getAuthor()  {
    	   return author;
       }
       public void setAuthor(String author) {
    	   this.author = author;
       }
       public String getCategory()  {
    	   return category;
       }
       public void setCategory(String category) {
    	   this.category = category;
       }

	   public int getBookId() {
		  return bookId;
	   }

	   public void setBookId(int bookId) {
		   this.bookId = bookId;
	   }

	   public int getPrice() {
		  return price;
	   }

	   public void setPrice(int price) {
		  this.price = price;
	   }

	@Override
	public String toString() {
		return "Book [title=" + title + ", bookId=" + bookId + ", author=" + author + ", price=" + price + ", category="
				+ category + "]";
	}
}
