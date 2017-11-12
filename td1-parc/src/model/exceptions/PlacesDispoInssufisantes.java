package model.exceptions;

import java.lang.Exception;

public final class PlacesDispoInssufisantes extends Exception {
	public PlacesDispoInssufisantes(){
		super();
	}
	public PlacesDispoInssufisantes(String message){
		super(message);
	}
}