package Pr4;

public class Medic {

	
	
	public void appointment(Animal animal,String procedures){
		
		System.out.print("Animal appoint and add to registry");
		
		Registry.addToRegistry(new Registry(procedures,animal));
		
	}
	
	
	
}
