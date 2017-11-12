package model.declaration;

public interface ParcAttractionItf {

	int nbPlacesDispo();
    void vendreBillets(int nb,Tarif tarif);
	void reinitialiser();
	double chiffreAffaire();
	double tauxRemplissage();
}