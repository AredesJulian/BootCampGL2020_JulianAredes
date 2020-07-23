import java.util.ArrayList;

public class PrimeraLista {

	public void main() {

		ArrayList<String> letters = new ArrayList<>();

		letters.add("A");
		letters.add("B");
		letters.add("C");

		System.out.println(letters);

		System.out.println("Tamaño lista: " + letters.size());
		
		letters.set(0, "X");
		
		System.out.println(letters);


	}

}
