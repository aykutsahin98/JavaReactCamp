package staticDemo;
//Bir metodu Static yaptigimizda direkt sinif ismiyle cagirabiliriz.
public class ProductValidator {
	
	static {
		System.out.println("Static Yapici Metod Calisti");
	}
	public  ProductValidator() {
		System.out.println("Yapici Blok Calisti");
	}
	
	
	public static boolean isValid(Product product) {
		if(product.price > 0 && !product.name.isEmpty())	{
			return true;
		}else {
			return false;
		}
	}
	//Inner Class - Bir sinif icinde baska bir sinif olusturma
	public static class differentClass{
		public static void Delete() {
			
		}
	}

}





