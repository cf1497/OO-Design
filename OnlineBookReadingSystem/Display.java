package OnlineBookReadingSystem;

public class Display {
	private Book activeBook;
	private User activeUser;
	
	private int pageNumber = 0;
	
	public Display(){
		
	}
	
	
    public void refreshTitle(){
    	
    }
    
    
	public void refreshUsername() {
		
	}
	
	public void refreshDetails(){
		
	}
	
	public void refreshPage(){
		
	}
	
	public void disPlayUser(User user){
		user = activeUser;
		refreshUsername();
	}
	
	public void disPlayBook(Book book){
		pageNumber = 0;
		activeBook = book;
		
		refreshTitle();
		refreshDetails();
		refreshPage();
		
	}
	
	public void turnPageForward(){
		pageNumber++;
		refreshPage();
	}
	
	public void turnPageBackward(){
		pageNumber--;
		refreshPage();
	}
}
