import java.util.ArrayList;

public class Practica_5_Main_Herencia {

	public static void main(String[] args) {

		System.out.println("Practica 5.1");
		System.out.println("---------------");

		Electrodomestico electrodomestico = new Electrodomestico();
		Heladera heladera = new Heladera();

		electrodomestico.setMarca("Electro");
		electrodomestico.setColor("Blanco");

		heladera.setMarca("Generica 2");
		heladera.setColor("Gris");

		System.out.println("Electrodomestico -/ Marca: " + electrodomestico.getMarca() + "/ Color: "
				+ electrodomestico.getColor());
		System.out.println("Heladera -/ Marca: " + heladera.getMarca() + "/ Color: " + heladera.getColor());

		electrodomestico.encender();

		heladera.encender();

		System.out.println("---------------");
		
		System.out.println("Practica 5.2");
		System.out.println("---------------");

		Heladera heladera2 = new Heladera();
		Televisor televisor = new Televisor();
		Cafetera cafetera = new Cafetera();

		ArrayList<Electrodomestico> electrodomesticos = new ArrayList<Electrodomestico>();

		electrodomesticos.add(heladera2);
		electrodomesticos.add(televisor);
		electrodomesticos.add(cafetera);

		for (Electrodomestico e : electrodomesticos) {
			e.encender();

		}
		
		System.out.println("---------------");

		System.out.println("Practica 5.3");
		System.out.println("---------------");
	
		
		Practica_53_Encapsulamiento encapsulamiento = new Practica_53_Encapsulamiento();
		
		encapsulamiento.setNombre("Chiqui");
		encapsulamiento.setPatas(6);
		
		System.out.println("El gato se llama: "+encapsulamiento.getNombre());
		System.out.println("Patas que tiene: "+encapsulamiento.getPatas());
		
		System.out.println("---------------");

		System.out.println("Practica 5.4");
		System.out.println("---------------");
		
		Berlina berlina = new Berlina();
		
		berlina.avanzar();
		
	}
}


