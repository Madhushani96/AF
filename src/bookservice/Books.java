package bookservice;

import java.util.ArrayList;
import java.util.List;

public class Books {
	
	
	
	
	public static final String INSTANCE = null;
	private static ArrayList<Book> books = new ArrayList<>();
	static {
		books.add(new Book(1, "The Outliers", 500));
		books.add(new Book(2, "World Is Flat", 550));
	}
	public static List<Book> getBooks() {
		return books;
	}
//	public static  List<Book> addBooks(int id,String name,int price){
		public static void addBooks(String name, double price){
			int id= 1;
			if(!books.isEmpty()){
				id = books.get(books.size()-1).getId() + 1;
			}
			books.add(new Book(id, name, price));
		}
		
		public static void deleteBooks(int id){
			for(Book book: books){
				if(book.getId() == id){
					books.remove(book);
				}
			}
}
}