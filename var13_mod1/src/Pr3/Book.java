package Pr3;

public class Book {

	private int id;
	private String name;
	private String author;
	private String publishingHouse;
	private int year;
	private int numOfPages;
	private int price;
	
	
	public Book(int id,String name,String author, String publishingHouse,int year,int numOfPages,int price){
		
		this.id=id;
		this.name=name;
		this.author=author;
		this.publishingHouse=publishingHouse;
		this.year=year;
		this.numOfPages=numOfPages;
		this.price=price;
		
	}
	
	public String getAuthor(){
		return author;
	}
	
	public String getPublishingHouse(){
		return publishingHouse;
	}
	
	public int  getYear(){
		return year;
	}
	
	@Override
	public String toString(){
		
		return "id: "+id+" name: "+name+" author: "+author+" publishing house: "+ publishingHouse+" year: "+year+" numOfpages: "+numOfPages+" price: "+price;
	}
	
}
