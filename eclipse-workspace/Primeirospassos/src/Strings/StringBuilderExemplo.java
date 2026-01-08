package Strings;

public class StringBuilderExemplo {
	
	 public static void main(String[] args) {

	        StringBuilder frase = new StringBuilder();


	        frase.append("Homem ");
	        frase.append("de ");
	        frase.append("Ferro");
	        
	        System.out.println(frase);
	        
	        frase.replace(0, 5, "Capitão");
	        System.out.println(frase);
	        
	        frase.insert(0, "Herói: ");
	        System.out.println(frase);
	        
	 }

}
