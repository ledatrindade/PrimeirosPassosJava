package disney;

import java.util.Scanner;

public class MainDisney {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Princesa princesa = null;
        int opcao;

        do {
            System.out.println("""
                
                ===== MENU PRINCESAS =====
                1 - Criar Princesa da Floresta
                2 - Criar Princesa do Castelo
                3 - Apresentar princesa
                4 - Detalhes da princesa
                5 - Ação especial
                0 - Sair
                """);

            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine(); // consumir \n

            switch(opcao) {
                case 1 -> {
                    System.out.print("Nome: "); String nome = sc.nextLine();
                    System.out.print("Cabelo: "); String cabelo = sc.nextLine();
                    System.out.print("Vestido: "); String vestido = sc.nextLine();
                    System.out.print("País: "); String pais = sc.nextLine();
                    System.out.print("Animal amigo: "); String animal = sc.nextLine();
                    princesa = new PrincesaFloresta(nome, cabelo, vestido, pais, animal);
                    System.out.println("Princesa da floresta criada!");
                }
                case 2 -> {
                    System.out.print("Nome: "); String nome = sc.nextLine();
                    System.out.print("Cabelo: "); String cabelo = sc.nextLine();
                    System.out.print("Vestido: "); String vestido = sc.nextLine();
                    System.out.print("País: "); String pais = sc.nextLine();
                    System.out.print("Baile favorito: "); String baile = sc.nextLine();
                    princesa = new PrincesaCastelo(nome, cabelo, vestido, pais, baile);
                    System.out.println("Princesa do castelo criada!");
                }
                case 3 -> {
                    if(princesa != null) princesa.apresentar();
                    else System.out.println("Crie uma princesa primeiro!");
                }
                case 4 -> {
                    if(princesa != null) princesa.detalhes();
                    else System.out.println("Crie uma princesa primeiro!");
                }
                case 5 -> {
                    if(princesa != null) {
                        // Uso de instanceof para chamar ação especial
                        if(princesa instanceof PrincesaFloresta pf) pf.conversarComAnimal();
                        else if(princesa instanceof PrincesaCastelo pc) pc.dançar();
                    } else System.out.println("Crie uma princesa primeiro!");
                }
                case 0 -> System.out.println("Encerrando...");
                default -> System.out.println("Opção inválida!");
            }

        } while(opcao != 0);

        sc.close();
    }
}
