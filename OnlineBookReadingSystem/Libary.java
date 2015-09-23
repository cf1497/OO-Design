package OnlineBookReadingSystem;

import java.util.HashMap;

public class Libary {
	private HashMap<Integer, Book> books;
	
	public Libary(){
		
	}
	
	public void addBook(int BookID, String details){
		if(!books.containsKey(BookID)){
			Book book = new Book(BookID,details);
			books.put(BookID, book);
		}
	}
	
	public boolean removeBook(int BookID){
		if(!books.containsKey(BookID)){
			return false;
		}
		
		books.remove(BookID);
		return true;
	}
	
	public Book findBook(int BookID){
		return books.get(BookID);
	}
	
	
}
