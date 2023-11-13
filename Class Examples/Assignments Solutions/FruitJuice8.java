package com.assignments;

public class FruitJuice8 {
	int product_code;	
	String flavour	;       
	String pack_type;	
	int pack_size	;      
	int product_price;	

	public FruitJuice8() {
	
	}
	
	public void input(int product_code,String flavour,String pack_type,int pack_size,int product_price) {
		
		this.product_code=product_code;
		this.flavour=flavour;
		this.pack_type=pack_type;
		this.pack_size=pack_size;
		this.product_price=product_price;
		
	}
	public void discount() {
		this.product_price=product_price-10;
	}
	
	public void dispaly() {
		discount();
		System.out.println("product_code="+product_code+"\n"+ "flavour="+flavour+"\n"+"pack_type="+ pack_type+"\n"+"product_price="+product_price);
	}
	
	public static void main(String[] args) {
			FruitJuice8 obj=	new	FruitJuice8();
			
			obj.input(12, "orange", "tetra", 1000, 20);
	
			obj.dispaly();
	}
}

