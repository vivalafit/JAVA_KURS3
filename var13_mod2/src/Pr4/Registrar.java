package Pr4;

import java.util.ArrayList;

public class Registrar {

	
	private ArrayList<Animal> an = new ArrayList<Animal>();
	
	
	public void addAnimalForAppointment(Animal animal){
		
		System.out.println("Animal added: "+animal.toString());
		
		an.add(animal);
	}
	
	
	
	
}
