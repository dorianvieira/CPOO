package implemtation;

import java.lang.String;

public class Employe{ 
	private String nom;
	private double salaire;
	private int nbH;
	
	public Employe(String nom, double salaire, int nbH){
			this.nom=nom;
			this.salaire=salaire;
			this.nbH=nbH;
	}
	
	public int getHeuresHebdo(){
		if(nbH>60){
			System.out.print("Heures hebdo passées");
		}
		else {
			return nbH;
		}
	}
	
	public double salaireHebdo(){
		if(getHeuresHebdo()>40) {
			return 1.5*13;
		}
		else {
			return nbH*13;
		}
		
	}
	
	public String toString(){
		 StringBuilder sb = new StringBuilder();
		sb.append(this.nom).append(",").append("salaire horaire : ").append(salaireHebdo()).append("euros;").append("heures travaillées :").append(getHeuresHebdo()).append("\n");
   
		 return sb.toString();
	}
	

}