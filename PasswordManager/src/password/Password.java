package passwordManager;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;

/**
 * @author Karmehr Arora
 * This project:
 * 		Creates secure passwords
 * 		Is designed to ensure each password is unique
 */
public class Password {
	private String password;
	
	Password(){
		super();
	}
	
	Password(String keyword){
		password = createPassword(keyword);
	}
	
	Password(String keyword, int length){
		password = createPassword(keyword, length);
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getPassword() {
		return password;
	}
	
	@Override
	public boolean equals(Object o) { // checks if the password is the same
		Password pm = (Password) o;
		if(this.password.equals(pm.password))
			return true;
		return false;
	}
	
	@Override
	public int hashCode() {
		return password.hashCode();
	}
	
	/**
	 * @param file: file from which pass is being compared to for uniqueness
	 * @param pass: password being tested for uniqueness
	 * @return true if password is unique
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	protected boolean isUnique(File file, String pass) throws FileNotFoundException, IOException {
		HashSet<String> unique = new HashSet<>();
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		String line = "";
		while(line != null) {
			try {
				line = br.readLine();
				if(line != null && line.substring(0, 10).equals("Password: "))
					unique.add(line.substring(10));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		br.close();
		fr.close();
		return unique.add(pass);
	}
	
	/**
	 * creates a strong password of default length 15 characters
	 * password includes a variation of 
	 * 			Capital & Lower case letters
	 * 			Numbers
	 * 			Symbols
	 * @return new, unique password
	 */
	protected String createPassword() {
		String pass = "";
		
		return password;
	}

	/**
	 * creates a strong password the length of the keyword
	 * replaces letters in the keyword with numbers/symbols while also varying upper & lower case letters
	 * @param key: keyword upon which the password is created
	 * @return new, unique password
	 */
	protected String createPassword(String key) {
		
		return password;
	}
	
	/**
	 * Creates a strong password the length of the number of characters specified in the parameter
	 * replaces letters in the keyword with numbers/symbols while also varying upper & lower case letters
	 * adds onto keyword with additional characters as necessary
	 * @param key: keyword upon which the password is created
	 * @param characters number of characters the password is required to be
	 * @return new, unique password
	 */
	protected String createPassword(String key, int characters) {
		
		return password;
	}
}
