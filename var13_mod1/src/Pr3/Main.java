package Pr3;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(" Developed by NAME");
		
		Book[] books = new Book[5];
		
		books[0]= new Book(0, "Book Of Souls", "John", "Abababa", 1999, 345, 15);
		books[1]= new Book(1, "Death Metal Story", "Den", "New York Publish", 1956, 543, 20);
		books[2]= new Book(2, "Metallica", "John", "Kyiv Book House", 2011, 127, 10);
		books[3]= new Book(3, "War Of Worlds", "Betty", "Abababa", 1989, 1098, 57);
		books[4]= new Book(4, "Darkest Hour", "Alicia", "Kyiv Book House", 1923, 252, 17);
		
		
		byAuthor("John",books);
		byPublishingHouse("Kyiv Book House",books);
		byYear(1989,books);

	}

	
	
	public static void byAuthor(String auth,Book[] books){
		
		for(int i=0;i<books.length;i++){
			if(books[i].getAuthor().equals(auth)){
				System.out.println(books[i].toString());
			}
		}
		
	}
	
public static void byPublishingHouse(String publ,Book[] books){
		
		for(int i=0;i<books.length;i++){
			if(books[i].getPublishingHouse().equals(publ)){
				System.out.println(books[i].toString());
			}
		}
		
	}

public static void byYear(int year,Book[] books){
	
	for(int i=0;i<books.length;i++){
		if(books[i].getYear()>(year)){
			System.out.println(books[i].toString());
		}
	}
	
}
	
	
	
}
