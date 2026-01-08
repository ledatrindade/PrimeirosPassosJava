package mapWrappers;

import java.util.Map;
import java.util.HashMap;

public class MapExemplo {
	
	public static void main(String[] args) {
		
		Map<String, Integer> poderHerois = new HashMap<>();
		
		poderHerois.put("Homem de ferro", 85);
        poderHerois.put("Thor", 100);
        poderHerois.put("Capitão América", 90);
		poderHerois.put("Homem de ferro", 85);
		
	    System.out.println("Poder do Thor: " + poderHerois.get("Thor"));		
	    
	    
	    for (String heroi : poderHerois.keySet()) {
	    		
            System.out.println(heroi + " → " + poderHerois.get(heroi));
            
        }
	    
		Map<Integer, String> poHerois = new HashMap<>();
		
		poHerois.put(85, "Homem de ferro");
        poHerois.put(100, "Thor");
        poHerois.put(90, "Capitão América");
		poHerois.put(85, "Homem de ferro");
		
	    System.out.println("\nde quem é o poder com o valor 90: " + poHerois.get(90));		
	    
	    
	    for (Integer heroi : poHerois.keySet()) {
	    		
            System.out.println(heroi + " → " + poHerois.get(heroi));
            
        }
	    
	    
		
	}

}

