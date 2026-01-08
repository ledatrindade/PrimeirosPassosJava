package arrays;

import java.util.HashSet;
import java.util.Set;

public class SetExemplo {

	public static void main(String[] args) {
		
		Set<String> herois = new HashSet<>();
		
			herois.add("Homem de Ferro");
			herois.add("Capitão América");
			herois.add("Viúva Negra");
			herois.add("Thor");
			herois.add("Homem de Ferro");
			herois.add("Capitão América 2");
			
	    	  int i = 0;
			
		      for (String heroi : herois) {
		    	  
		    	 i++;
		    	  
		         System.out.println("Herói " + i + ":" + heroi);
		    	 
		         
		      }
		      
		      System.out.println("\nTotal de heróis: " + herois.size());
			
			
	}
}
