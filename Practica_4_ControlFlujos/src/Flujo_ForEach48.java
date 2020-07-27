import java.util.ArrayList;

public class Flujo_ForEach48 {

	public void main() {
		
		ArrayList<Integer> List = new ArrayList<Integer>();
		
		List.add(1);
		List.add(2);
		List.add(3);
		List.add(4);
		List.add(5);
		List.add(6);
		List.add(7);
		List.add(8);
		List.add(9);
		List.add(10);
	
	for (Integer integer : List) {
		
		System.out.println("Valor iterado: "+integer);
	}
	
	System.out.println("-------------------");

	// 4.10
	System.out.println("Practica 4.10 foreach");
	System.out.println("-------------------");
	
	ArrayList<String> dias = new ArrayList<String>();
	
	dias.add("Lunes");
	dias.add("Martes");
	dias.add("Miercoles");
	dias.add("Jueves");
	dias.add("Viernes");
	dias.add("Sabado");
	dias.add("Domingo");
	
	for (String string : dias) {
		
		System.out.println("Dia de la semana: "+string);
		
	}
	System.out.println("-------------------");

	// 4.11
	System.out.println("Practica 4.11 foreach");
	System.out.println("-------------------");
	
	String Cadena = "BootCamp 2020";
	
	for (char c: Cadena.toCharArray ()) { System.out.println (c); }
		
	System.out.println(Cadena.charAt(0));
		
		
	}
	
	}
