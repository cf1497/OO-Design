package OnlineBookReadingSystem;

public class Book {
	private int bookID;
	private String details;
	
	public Book(int id, String s){
		bookID = id;
		details = s;
	}
	
	public int getBookID(){
		return bookID;	
	}
	
	public String getDetails(){
		return details;
	}
	
	public void setBookID(int id){
		bookID = id;
	}
	
	public void setDetails(String s){
		details  = s;
	}
}
