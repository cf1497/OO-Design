package OnlineBookReadingSystem;

import java.util.HashMap;

public class UserManager {
	private HashMap<Integer, User> users;
	
	public UserManager(){
		
	}
	
	public void addUser(int id, String name, int type){
		if(!users.containsKey(id)){
			User user = new User(id, name, type);
			users.put(id,user);
		}
	}
	
	public boolean removeUser(int userid){
		if(!users.containsKey(userid)){
			return false;
		}
		
		users.remove(userid);
		return true;
	}
	
	public User findUSer(int id){
		return users.get(id);
	}
}
