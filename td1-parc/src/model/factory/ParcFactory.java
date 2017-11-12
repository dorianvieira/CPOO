package model.factory;

import model.declaration.ParcAttractionItf;
import model.implementation.Parc;

/*class de creation du parc */
public final class ParcAttractionFactory
{
	//creation constructeur de l'employé
	public Parc createParc(String nom, int capacite,double prixUnitaire){
			return new Parc(nom,capacite,prixUnitaire);
			//on ne place pas nb billets vendus car il est dynamique
	}
}