
public class FlujoWhile48 {
	
	public void main() {
		
		int myNum=1;
		
		while (myNum<=50) {
			
			if (myNum%2==0) {
				
				System.out.println("Valor iterado " +myNum+ " par" );
				
			}else {
				
				System.out.println("Valor iterado " +myNum+ " impar");
			}
			
			myNum++;
		}
	}

}
