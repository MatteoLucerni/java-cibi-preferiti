package org.lessons.java.array;

public class CibiPreferiti {
	public static void main(String[] args) {
		String[] dishes = {
	            "Lasagna",
	            "Pizza Margherita",
	            "Sushi",
	            "Bistecca alla griglia",
	            "Insalata Caesar",
	            "Pasta Carbonara",
	            "Tacos al pastor",
	            "Gelato alla vaniglia",
	            "Cioccolato fondente",
	            "Risotto ai frutti di mare"
	        };
		
		System.out.println("Numero piatti: " + dishes.length);
		System.out.println("Piatto preferito: " + dishes[0]);
		System.out.println("Piatto preferito ma non troppo: " + dishes[dishes.length-1]);
		System.out.println("Mediana: " + dishes[dishes.length/2]);
	}
}
