package oopIntro;

public class Product {
	//Constructor(Yap�c�) Blok
	public Product() {
		System.out.println("Ben �al��t�m");
	} 
	
	public Product(int id,String name, double unitPrice, String detail) {
		//E�itleme y�ntemi
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
