package Pr4;

public class Vet extends Medic {

	
	public Vet(){
		super();
	}
	
	
	public String heal(Animal animal,String procedures){
		
		System.out.println("Healing by: "+procedures);
		
		return procedures;

	}
	
	
}
