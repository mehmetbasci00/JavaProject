package oopIntro;

public class Product {
	//Constructor(Yapýcý) Blok
	public Product() {
		System.out.println("Ben çalýþtým");
	} 
	
	public Product(int id,String name, double unitPrice, String detail) {
		//Eþitleme yöntemi
		this();
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.detail = detail;
		
	}
	
	int id;
	String name;
	double unitPrice;
	String detail;
	

}
