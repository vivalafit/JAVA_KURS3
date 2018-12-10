package Pr4;

public class MainVets {

	
	
	public static void main(String[] args){
		
		Animal an=new Animal("Dog","Dick",5);
		Animal a=new Animal("Cat","Tom",2);
		
		Registrar reg=new Registrar();
		
		Nurse nur = new Nurse();
		
		Vet vet =new Vet();
		
		
		
		reg.addAnimalForAppointment(an);
		reg.addAnimalForAppointment(a);
		
		String s;
		
		s=vet.heal(an, "pills");
		
		nur.appointment(an, s);
		
		s=vet.heal(a, "mixture");
		
		vet.appointment(a, s);
		
		System.out.print("DONE");
	}
	
	
}
