package Strings;

public class StringBufferExemplo {
	
    public static void main(String[] args) {
	
    StringBuffer frase = new StringBuffer();

    frase.append("Vingadores ");
    frase.append("Avante!");

    System.out.println(frase);

    frase.insert(0, "Grito: ");
    System.out.println(frase);
}

}
