package Pr4;

public class Animal {

	private String type;
	private String name;
	private int yearsOld;
	
	
	public Animal(String type,String name, int yearsOld){
		this.type=type;
		this.name=name;
		this.yearsOld=yearsOld;
	}
	
	@Override
	public String toString(){
		
		return "type of animal: "+type+" name: "+name+" years: "+yearsOld;
		
	}
	
}
