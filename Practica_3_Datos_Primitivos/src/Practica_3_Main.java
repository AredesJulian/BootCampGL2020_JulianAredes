

public class Practica_3_Main {

	public static void main(String[] args) {
//3.1
		System.out.println("Practica 3.1");
		System.out.println("----------------------------------");
		TiposPrimitivos tiposprimitivos = new TiposPrimitivos();

		System.out.println("El valor de mi numero es: " + tiposprimitivos.myNum);
		System.out.println("El valor de caracter es: " + tiposprimitivos.myChar);
		System.out.println("El valor de b es: " + tiposprimitivos.myTrueFalse);
		System.out.println("El valor de mifloat es: " + tiposprimitivos.myFloat);
		System.out.println("El valor de mishort es: " + tiposprimitivos.myShort);

		System.out.println("----------------------------------");
//3.2
		System.out.println("Practica 3.2");
		System.out.println("----------------------------------");

		PrimeraVariable primeraVariable = new PrimeraVariable();

		primeraVariable.main();

		System.out.println("----------------------------------");

//3.3
		System.out.println("Practica 3.3");
		System.out.println("----------------------------------");

		PrimeraLista lista = new PrimeraLista();

		lista.main();

		System.out.println("----------------------------------");

//3.4
		System.out.println("Practica 3.4");
		System.out.println("----------------------------------");

		StudentDetails studentDetails = new StudentDetails();

		studentDetails.studenAge();

		System.out.println("----------------------------------");


	}

}
