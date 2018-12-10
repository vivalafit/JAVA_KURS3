package Pr4;

import java.util.ArrayList;

public class Registry {

	private static ArrayList<Registry> registry=new ArrayList<Registry>();
	
	private String procedures;
	private Animal animal;
	
	
	public Registry(String procedures,Animal animal){
		this.procedures=procedures;
		this.animal=animal;
	}
	
	public static void addToRegistry(Registry regist){
		
		System.out.println("Animal added to registry");
		
		registry.add(regist);
	}
	
	
}
