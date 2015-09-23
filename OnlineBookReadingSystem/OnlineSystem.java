package OnlineBookReadingSystem;

import java.util.List;

public class OnlineSystem {
	private Libary libary;
	private UserManager userManager;
	private Display display;
	private List<Book> activeBooks;
	private User activeUser;
	public OnlineSystem(){
		userManager = new UserManager();
		libary = new Libary();
		display = new Display();
	}
	
	public Libary getLibary(){
		return libary;
	}
	
	public UserManager getUserManager(){
		return userManager;
	}
	
	public Display getDisplay(){
		return display;
	}
	
	public List<Book> getActiveBook(){
		return activeBooks;
	}
	
	//my own way
	public void setActive(Book book){
		activeBooks.add(book);
	}
	
	public User getActiveUser(){
		return activeUser;
	}
	
	public void setUserActive(User user){
		activeUser = user;
	}
}
