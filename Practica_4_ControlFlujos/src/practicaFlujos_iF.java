
public class practicaFlujos_iF {

	public void main() {

		int myNum = 3;
		int myNumDos = 10;
		char myChar = 'A';
		char myCharDos = 'b';
		
		if (myNum + myNumDos <= 10) {

			System.out.println("La suma de los numeros es : " + myNum + myNumDos);
			
		} else {
			System.out.println("La suma de los numeros es Mayor a 10");
		}
		

		if (Character.isUpperCase(myChar)) {

			System.out.println("La  letra : " +myChar+ " es mayuscula");

		};
		
		
		if (Character.isLowerCase(myCharDos)) {
			
			System.out.println("La  letra : " +myCharDos+ " es minuscula");

			
		};
		
	}
}
