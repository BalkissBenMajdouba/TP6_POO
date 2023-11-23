package ex2;

import java.io.IOException;

public class TestAuthentification {

	public static void main(String[] args) throws IOException {
		Authentification a;
		boolean auth=true;
	do {
		
	
		try { a=new Authentification();
		
		}catch(WrongLoginException e1) {
			System.out.println(e1.alerte());
			auth=false;
		}
		catch(WrongPasswordException e2) {
			System.out.println(e2.alerte());
			auth=false;
		}catch(WrongInputLength e3) {
			System.out.println(e3.alerte());
			System.exit(0);
		}
		finally {
				System.out.println("fin du prog!");
			};
	
	}
	while(auth==false);

}
}
