package passwordManager;

import java.io.File;
import java.util.Scanner;

/**
 * @author Karmehr Arora
 * This project:
 * 		Creates secure passwords
 * 		Is designed to ensure each password is unique
 * 		Encrypts & records the account, username, and password in a document
 * 		Creates its own directory and file as needed and as requested by the user
 */
public class Account {
	private String account, username, keyword, password;
	private static File dir, file;

	Account(String account, String username, String keyword, String password){
		this.account = account;
		this.username = username;
		this.keyword = keyword;
		this.password = password;
	}
	
	@Override
	public boolean equals(Object o) {
		Account a = (Account) o;
		if(this.account.equals(a.account))
			if(this.username.equals(a.username))
				if(this.keyword.equals(a.keyword))
					if(this.password.equals(a.password))
						return true;
		return false;
	}
	
	@Override
	public int hashCode() {
		return account.hashCode() + username.hashCode() + keyword.hashCode() + password.hashCode();
	}
	
	/**
	 * Saves account details in an encrypted file
	 * @param acc: account to be saved
	 */
	public static void save(Account acc) {
		try {
			if(dir.isDirectory() && file.isFile()) {
				// save password in this file
			}
			else {
				// create this file in this directory
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);	
		System.out.println("");
		
		//Password pass = new Password();
		//save(pass);
	}
}
