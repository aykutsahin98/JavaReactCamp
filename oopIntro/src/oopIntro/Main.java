package oopIntro;

public class Main {

	public static void main(String[] args) {
		
		Product product1 = new Product(1,"Galaxy A52", 4200, "Cep Telefonu", 10); //referans oluþturma, intance
		
		
		Product product2 = new Product(); //referans oluþturma, intance
		product2.setId(2);
		product2.setName("Canon EOS");
		product2.setDetail("Kamera");
		product2.setDiscount(10);
		product2.setUnitPrice(3200);
		
		System.out.println(product2.getUnitPriceAfterDiscount());
		
		Category category1 = new Category();
		category1.setId(1);
		category1.setName("Cep Telefonu");
		
		Category category2 = new Category();
		category2.setId(2);
		category2.setName("Fotograf Makineleri");
		
		System.out.println(category1.getName());
		System.out.println(category2.getName());
		
		/*Product product3 = new Product(); //referans oluþturma, intance
		
		
	    Product [] products = {product1,product2,product3};
	    
	    for (Product product : products) 
	    {
	    	System.out.println(product.name);
	    }
	    
	    System.out.println(products.length);
	    
	    Category category1 = new Category();
	    category1.id = 1;
	    category1.name = "Teknoloji";
	    
	    Category category2 = new Category();
	    category2.id = 2;
	    category2.name = "Kameralar";
	    
	    ProductManager productManager = new ProductManager();
	    productManager.addToChart(product1); //sepete eklendi.
	    
	    productManager.addToChart(product2);
	    productManager.addToChart(product3);	*/

	}

}
