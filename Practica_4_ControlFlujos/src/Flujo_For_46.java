import java.util.ArrayList;

public class Flujo_For_46 {
	
	public void main() {
		
				
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Lunes");
		list.add("Martes");
		list.add("Miercoles");
		list.add("Jueves");
		list.add("Viernes");
		list.add("Sabado");
		list.add("Domingo");

		for (int i = 0; i <=6; i++) {
			
			System.out.println(list.get(i));
			
		}
	}

}
