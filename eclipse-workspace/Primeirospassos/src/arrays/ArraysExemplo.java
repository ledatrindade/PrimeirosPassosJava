package arrays;

public class ArraysExemplo {
	
	public static void main(String[] args) {
		
		String[] herois = new String[3];
		
		herois[0] = "Homem de Ferro";
		herois[1] = "Capitão América";
		herois[2] = "Viúva Negra";
		
		for (int i = 0; i < herois.length; i++) {
			
			System.out.println("Herói " + (i + 1) + ": " + herois[i]);
			
		}
		
	}

}
