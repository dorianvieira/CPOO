package implementation;


import java.util.logging.Logger;
import java.lang.String;

import model.declaration.ParcAttractionItf;
import model.enumeration.ParcEnum;
import model.exceptions.PlacesDispoInssufisantes;


public final class Parc implements ParcAttractionItf{  //final car plus possible de le modifier apres
	private static final Logger LOG = Logger.getLogger(Parc.class.getCanonicalName());
	
	private String nom;
	static final int capacite; // car définit
	private double tarifUnitaire;
	private int nbPlacesVendues;//il est dynamique 
	
	
	public Parc(String nom, int capacite,double prix){
			this.nom=nom;
			this.capacite=capacite;
			this.tarifUnitaire=prix;
	}
	

	
	@Override
	public int nbPlacesDispo() {
		return(capacite-nbPlacesVendues);
	}
	
	public String getNomParc(){
    	return this.nom;
    }
	
	@Override
	public void vendreBillets(int nb,Tarif tarif) throws PlacesDispoInssufisantes{ //tarif est de type enum Tarif
		try{
			if(nb>nbPlacesDispo()){
				throw new PlacesDispoInssufisantes("Le nombre de places demandées est superieur au nombre de places disponibles restantes, il reste: "+nbPlacesDispo();
			} else if(nb<=nbPlacesDispo){
					nbPlacesVendues=nbPlacesDispo-nb;
			}
		}catch(PlacesDispoInssufisantes ex);
		LOG.severe("Il n'est pas possible d'acheter un nombre de place qui est superieur aux nombres de places restantes");
	}

	@Override
	public void reinitialiser();
    	nbPlacesDispo=nbPlacesDispo;
		nbPlacesVendues=0;
    }

	@Override
    public double chiffreAffaire(){
		if(!reinitialiser()){
			return(nbPlacesVendues*tarifUnitaire);
		}
	}
	
	public double tauxRemplissage(){
		return (nbPlacesVendues/(double)nbPlacesDispo)*100;
	}

	
	public String toString(){
		 StringBuilder sb = new StringBuilder();
		sb.append("Parc ").append(this.nom).append(",\n")
		.append(Tarif.illimite).append(" : ").append(TarifUnitaire+" euros,\n")//ou getPrix de enum Tarif?
		.append(Tarif.illimite5).append(" : ").append(TarifUnitaire+" euros,\n")
		.append(nbPlacesVendues).append("billets vendus au").append(Tarif.illimite+",\n")
		.append(nbPlacesVendues).append("billets vendus au").append(Tarif.illimite5+",\n")
		.append(nbPlacesVendues).append("billets vendus au").append(Tarif.reduit+",\n")
		.append(nbPlacesVendues).append("billets vendus au").append(Tarif.reduit5+",\n");
   
		 return sb.toString();
	}
	

}