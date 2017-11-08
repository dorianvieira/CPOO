 package main;
 
 import model.implementation.Employe;
 
 public final class EntrepriseJ{

	public static void main(String[]args){

		
		Employe john = new Employe("John",1500.00,43);
		Employe cecile = new Employe();
		Employe pierre = new Employe();
		Employe laurent = new Employe();
		Employe laurent2 = new Employe();

		
		System.out.println(john.toString());
		System.out.println(cecile.toString());
		System.out.println(pierre.toString());
		System.out.println(laurent.toString());
		System.out.println(laurent2.toString());
	
	}
}