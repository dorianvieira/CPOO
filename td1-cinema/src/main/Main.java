package main;

import java.util.logging.Logger;

import java.util.logging.Logger;
import java.util.logging.Level;
import java.util.logging.Handler;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.io.IOException;
import java.util.logging.SimpleFormatter;

import model.implementation.SalleCinema;
import model.exceptions.SallePleine;
import model.fact.SalleFactory;

public final class Main{

 
 private static final Logger LOG = Logger.getLogger(Main.class.getCanonicalName());

	public static void main(String[]args){

		
		SalleFactory sf = new SalleFactory();

       //SalleCinema salle1 = new SalleCinema();
		
		SalleCinema salle2 = new SalleCinema5("Fast and furious",15,150d);

		try{
            for(int i=0;i<=250;i++){
                salle2.vendrePlace();
            }
        }catch(SallePleine ex){
            LOG.severe(ex.getMessage());
        }finally{
            LOG.fine("Il y a encore" + salle2.nbPlacesDisponible() +" place(s) disponible(s)");
        }
            
        System.out.println(salle1.toString());    
        System.out.println(salle2.toString());
    }
}