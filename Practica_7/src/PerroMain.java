
public class PerroMain {
	
	public static void main (String[] args) {
		
		Perro perro = new Perro();
		
		perro.sonidoAnimal();
		
		perro.dormir();
		
		perro.come("Perro");
		
		Animal.camina("Perro");
		
		System.out.println("-----------------------------");
		
		Hombre hombre = new Hombre();
		
		hombre.dormir();
		hombre.hablar();
		hombre.sonidoAnimal();
		hombre.come("Hombre");
		
	}
	
	

}
