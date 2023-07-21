package password;

import java.util.Scanner;

/**
 * @author Karmehr Arora
 * This project:
 * 		Creates secure passwords
 * 		Is designed to ensure each password is unique through keyword identifiers
 * 		Encrypts & records the account, username, and password in a document
 * 		Creates its own directory and file as needed and as requested by the user
 */
public class PasswordManager implements Comparable<PasswordManager>{
	String account, username, password, keyword;
	
	PasswordManager(String account, String username, String keyword, String password){
		this.account = account;
		this.username = username;
		this.keyword = keyword;
		this.password = password;
	}
	
	@Override
	public int compareTo(PasswordManager pass) {
		
		return 0;
	}
	
	public String createPassword(String key) {
		
		return password;
	}
	
	public void storePassword() {
		
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);		
	}
}
