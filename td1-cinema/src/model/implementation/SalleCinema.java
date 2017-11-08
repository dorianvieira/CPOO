package implemtation;

import java.util.logging.Logger;
import java.lang.String;

import model.exceptions.SallePleine;
import model.declaration.CinemaItf;


public final class SalleCinema implements CinemaItf{ //cinema itf est une interface contient les methodes
	private static final Logger LOG = Logger.getLogger(SalleCinema.class.getCanonicalName());
	private String film;
	static final int nbPlaces; //public car on va l'initialisé direct et la variable bougera pas 
	private double tarif;
	private int nbPlacesVendues;


	public SalleCinema(String filmProjete, double prix, int nbPlaces){
			this.film=filmProjete;
			this.tarif=prix;
			this.nbPlaces=nbPlaces;
	}

	public SalleCinema(){
		this.film="Fast and furious";
		this.prix=15.0d;
		this.nbPlaces=500;
		this.nbPlacesVendues=0;
	}


	@Override
	public void vendrePlace() throws SallePleine{
		try{
			if (nbPlacesDisponible()==0) {
				throw new SallePleine("Salle remplie");
			}
		}catch(SallePleine ex){
			LOG.severe("La salle est déjà remplie, elle contient "+nbPlacesVendues()+" personnes");
            throw ex;
		}
		this.nbPlacesVendues++;
	}


	public double tauxRemplissage(){
		return (nbPlacesVendues/(double)nbPlaces)*100;

	}

	public double chiffreAffaire(){
		return (nbPlacesVendues*tarif);

	}

		public int nbPlacesDisponibles(){
		return (nbPlaces-nbPlacesVendues);
	}


	public void estPleine(){
		if(nbPlaces==nbPlacesVendues){
			 LOG.servere("La salle est pleine");
		}
		else {
			LOG.servere("Il reste: " + nbPlacesDisponibles() + "places");
		}
	}


	public String toString(){
		 StringBuilder sb = new StringBuilder();
		sb.append("Film Projeté ").append(this.film).append("\n")
                .append("tarif : ").append(this.tarif).append("\n")
                .append("Nombre de places : ").append(this.nbPlaces).append("\n")
                 .append("Taux Remplissage : ").append(tauxRemplissage()).append("%").append("\n")
                 .append("Chiffre d'affaires: ").append(chiffreAffaire()).append("%").append("\n");
		 return sb.toString();
	}

}