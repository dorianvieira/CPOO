package model.declaration;

import model.exceptions.HeuresHebdoDepassees;

public interface EntrepriseItf {

	double salaireHebdo() throws HeuresTravailDepasse;
    String getNom();
    double getSalaireBase();
    int getHeuresTravailles();
}