package ex2;
import java.util.Scanner;

class WrongLoginException extends Exception{
	public String alerte() {
		return ("Login incorrect !");}
}
class WrongPasswordException extends Exception{
	public String alerte() {
		return ("Password incorrect !");}
}
class WrongInputLength extends Exception{
	public String alerte() {
		return ("length >10");}
}
public class Authentification {
	final String loginCorrect="scott";
	final String PwdCorrect ="tiger";
	Scanner sc=new Scanner(System.in);
	
	 public String getUserLogin()throws WrongLoginException,WrongInputLength{
		System.out.println("donner le login");
		String login = sc.nextLine();
	

		if(login.equals(loginCorrect)==false) {
			throw new WrongLoginException();
		}
		else if (login.length()>10) {
			throw new WrongInputLength();
		}
		return login;
		
	}
	 public String getPwdLogin()throws WrongPasswordException,WrongInputLength{
		
		System.out.println("donner le pwd");
		String pwd = sc.nextLine();

		if(pwd.equals(loginCorrect)==false) {
			throw new WrongPasswordException();
		}
		else if (pwd.length()>10) {
			throw new WrongInputLength();
		}
		return pwd;
		
	}
	 
	 
	public Authentification() throws WrongInputLength, WrongPasswordException, WrongLoginException {
		
			String login=getUserLogin();
			String pwd=getPwdLogin();
/*try {
	}
		catch(WrongLoginException e1) {
			System.out.println(e1.alerte());
		}
		catch(WrongPasswordException e2) {
			System.out.println(e2.alerte());
		}
		finally {
			System.exit(0);
		}*/
		
	
	}
	
	

}
