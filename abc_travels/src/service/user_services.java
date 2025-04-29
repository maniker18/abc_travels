package service;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

import model.user;

public class user_services {
private List<user> users;
private Map<String, Integer> invalid_loginsMap;

public user_services(List<user> users, Map<String, Integer> invalid_loginsMap) {
	super();
	this.users = users;
	this.invalid_loginsMap = invalid_loginsMap;
}
public void user_registration() {
	Scanner scanner = new Scanner(System.in);
	System.out.println("user regesitration");
	System.out.println("enter your first name");
	String  firstname= scanner.next();
	System.out.println("enter your last name");
	String lastname = scanner.next();
	System.out.println("enter your phone number");
	int phonenumber= scanner.nextInt();
	System.out.println("enter your gender");
	String gender = scanner.next();
	System.out.println("enter your gmail");
	String gmail =scanner.next();
	System.out.println("enter your password");
	String password =scanner.next();

	
	
	if (emailexists(gmail)) {
		System.out.println("your gmail "+ gmail+" already exists");
		return;
	}
	user usersuUser = new user(firstname, lastname, phonenumber, gender, gmail, password, phonenumber, password);
	users.add(usersuUser);
	System.out.println("user registration succesful");
}
public boolean emailexists(String gmail) {
	for (user user : users) {
		if (user.getGmail().equals(gmail)) {
			return true;
		}
	}
	return false;
}
public  user login() {
	System.out.println("/n login menu");
	Scanner scanner = new Scanner(System.in);
	System.out.println("enter your gmail");
	String gmail = scanner.next();
	System.out.println("enter your password");
	String password = scanner.next();
	
	for (user user : users) {
		if (user.getGmail().equals(gmail)) {
			Integer attemptCount = invalid_loginsMap.getOrDefault(gmail, 0);
			if (attemptCount>=5) {
				System.out.println("your attempt is more than 5 times so locked ");
				return null;
			}
			
				if (user.getPassword().equals(password)) {
					System.out.println("login succesful");
					invalid_loginsMap.put(gmail, 0);
					return user;
				} 
				else {
	                int newCount = attemptCount + 1;
	                invalid_loginsMap.put(gmail, newCount);
	                System.out.println("Invalid credentials. Failed attempts: " + newCount);
	                return null;
			}
				
		}else {
			System.out.println("wrong gmail");
		}
	 
}
	return null;


}}


