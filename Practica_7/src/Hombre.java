
public class Hombre implements Animal, Persona {

	@Override
	public void hablar() {

		System.out.println("Las personas hablan mucho");

	}

	@Override
	public void dormir() {

		System.out.println("Las personas duermen mucho");

	}

	@Override
	public void come(final String s) {
		System.out.println("Se ejecuta metodo de la clase " + s);
	}

	@Override
	public void sonidoAnimal() {

		System.out.println("El hombre no hace sonidos de animal");

	}

}
