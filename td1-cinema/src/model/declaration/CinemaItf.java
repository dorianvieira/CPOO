package model.declaration;

import model.exceptions.SallePleine;

public interface CinemaItf {
	void vendrePlace() throws SallePleine;
	double tauxRemplissage();
	double chiffreAffaire();
	int nbPlacesDisponibles();
	void estPleine();
}