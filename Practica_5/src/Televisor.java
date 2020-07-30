
public class Televisor extends Electrodomestico {

	double pulgadas;
	String resolucion;

	public void cambiarCanal(int canal) {
		System.out.println("Cambiando al canal: " + canal);
	}

	public void encender() {
		System.out.println("Encendiendo Televisor.");
	}

}
