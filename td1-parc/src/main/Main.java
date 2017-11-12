 package main;

import java.util.logging.Logger;
import java.io.IOException;

import model.declaration.ParcAttractionItf;
import model.factory.ParcFactory;
import model.implementation.Parc;
import model.enumeration.Tarif
import model.exceptions.PlacesDispoInssufisantes;


public class Main {

	private static final Logger LOG = Logger.getLogger(Main.class.getCanonicalName());

	public static void main(String[] args){

		try{
			ParcFactory parc0 = new ParcFactory();
			
			SalleCinema parc1 = new Parc("MiageWonderland",180,Tarif.illimite);
		
			parc1.getNomParc();
			
			parc1.nbPlacesDispo();
			parc1.vendreBillets(24,Tarif.illimite);
			parc1.vendreBillets(19,Tarif.illimite5);
			parc1.vendreBillets(32,Tarif.reduit);
			parc1.vendreBillets(23,Tarif.reduit5);
			
			parc1.chiffreAffaire();
			parc1.tauxRemplissage();

			System.out.println(parc1.toString());
			
		}catch(PlacesDispoInssufisantes ex){
			LOG.severe(ex.getMessage());
		}
	}
}	