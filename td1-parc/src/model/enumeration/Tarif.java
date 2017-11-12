package model.enumration;

public enum Tarif {   
  
    illimite("Tarif illimité",38.50d),
	illimite5("Tarif illimité 5",28.50d), 
	reduit("Tarif reduit",38.50d*(70/100)),//26.95€
	reduit5("Tarif reduit 5",28.50d*(70/100));//14.25€
      
     private double prix;
	private String description;	
      
	Tarif(String description,double prix) {  
         this.prix=prix;
		 this.description=description;
    }  
      
     public double getPrix() {  
         return this.prix;  
    }  
	
	public String getDescription(){
		return this.description;
	}
}