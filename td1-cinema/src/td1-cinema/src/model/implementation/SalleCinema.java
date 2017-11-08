package implemtation;
import java.util.logging.Logger;
import java.lang.String;

public final class SalleCinema{ //final car
	private static final Logger LOG = Logger.getLogger(SalleCinema.class.getCanonicalName());
	private String film;
	static final int nbPlaces; //public car on va l'initialisé direct et la variable bougera pas 
	private double tarif;
	private int nbPlacesVendues;


	public SalleCinema(String filmProjeté, double prix, int nbPlaces){
			this.film=filmProjeté;
			this.tarif=prix;
			this.nbPlaces=nbPlaces;
	}

	public SalleCinema(){
		this.film="Fast and furious";
		this.prix=15.0d;
		this.nbPlaces=500;
		this.nbPlacesVendues=0;
	}


	public void vendrePlace(){
		nbPlacesVendues++;
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
			LOG.servere("Il reste: " + nbPlacesDisponibles());
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