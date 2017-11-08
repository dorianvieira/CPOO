package model.factory;

import model.dec.EntrepriseItf;
import model.impl.Employe;

public class EmployeFactory
{
	//creation constructeur de l'employé
	public Employe createEmploye(String nom, double salaireHoraire, int heuresTravailles){
			return new Employe(nom,salaireHoraire,heuresTravailles);
	}
}