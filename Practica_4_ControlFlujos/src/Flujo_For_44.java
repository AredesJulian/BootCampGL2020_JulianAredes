
public class Flujo_For_44 {

	public void main() {

		for (int i = 1; i <= 10; i++) {

			System.out.println("Valor iterado: " + i);

		}
		System.out.println("-------------------");

		// 4.5
		System.out.println("Practica 4.5");
		System.out.println("-------------------");

		int contSuma = 0;

		for (int i = 1; i <= 10000; i++) {

			if (i % 20 == 0) {

				contSuma = contSuma + 1;

			}

		}

		System.out.println("Cantidad de divisibles :" + contSuma);
	}

}
