package tpException;

class ParametreNullException extends Exception{
	public String alerte() {
		return ("impossible de faire une division par zéro");}
}
class NegatifException extends Exception{
	double x;
	NegatifException(double x)
	{
		this.x=x;
	}
	public String alerte() {
		return (x+ " est négatif : on ne peut pas calculer une racine pour un réel négatif !!!!!");}
}

public class Mathematique {
	static double f(double n, double x) throws ParametreNullException, NegatifException {
		if(n==0) {
			throw new ParametreNullException();
		}
		else if (x<0) {
			throw new NegatifException(x);
		}
		return Math.sqrt(x)/n;
	}
	public static void main(String...args) {
		try {
		double n=Double.parseDouble(args[0]);
		double x=Double.parseDouble(args[1]);
		System.out.println(f(n,x));
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Vous devriez entrer deux nombres sur la ligne de commande pour que ça fonctionne");
		}
		catch(NumberFormatException e2) {
			System.out.println("Les arguments doivent être des nombres");
		}
		catch(ParametreNullException e3) {
			System.out.println(e3.alerte());
		}
		catch(NegatifException e4) {
			System.out.println(e4.alerte());}
			
		
		finally {
			System.out.println("fin du prog");
		}
		
	}
}
