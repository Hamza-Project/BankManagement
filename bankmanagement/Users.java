package bankmanagement;

import java.util.*;

public class Users
{
	Stack<String> userName = new Stack<String>();
	Stack<String> password = new Stack<String>();
	
	public void userNamePush(String name)
	{
		userName.push(name);
	}
	
	public void passwordPush(String pass){
		password.push(pass);
	}
	
	public Boolean userNamePeek(String name)
	{
		Iterator userValue = userName.iterator();
		while(userValue.hasNext()) {
			if(name.equalsIgnoreCase((String)userValue.next())) {
				return true;
			}
		}
		return false;
	}
	
	public Boolean passwordPeek(String pass) {
		Iterator passValue = password.iterator();
		while(passValue.hasNext()) {
			if(pass.equalsIgnoreCase((String)passValue.next())){
				return true;
			}
		}
		return false;
	}
}