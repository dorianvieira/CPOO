package model.factory;

import model.dec.CinemaItf;
import model.impl.SalleCinema;

/*class de creation de la salle */
public final class SalleFactory
{
	public SalleCinema createSalleCinema(String filmProjete, double prix, int nbPlaces)
	{
		return new SalleCinema(filmProjete,prix,nbPlaces);
	}
}