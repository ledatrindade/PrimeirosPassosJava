package Strings;

public class StringExemplo {
	
    public static void main(String[] args) {

        String nome = "Homem de Ferro";

        System.out.println("Tamanho: " + nome.length());
        
        System.out.println("\n" + nome.toUpperCase());
        System.out.println("\n" + nome.toLowerCase());
        
        if (nome.contains("Ferro")) {
        	
        System.out.println("\nO Homem de Ferro esta aqui");
        
        } else {
        	
        System.out.println("\nO Homem de Ferro não esta aqui");	
        	
        }

        String novoNome = nome.replace("Ferro", "Aranha");
        
        System.out.println("\nNome original: " + nome);
        System.out.println("Novo nome: " + novoNome); 
        
    }

}
