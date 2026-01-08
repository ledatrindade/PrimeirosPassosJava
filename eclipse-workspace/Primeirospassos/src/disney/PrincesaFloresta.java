package disney;

// Subclasse que herda de Princesa
public class PrincesaFloresta extends Princesa {

    private String animalAmigo;

    // Construtor
    public PrincesaFloresta(String nome, String corCabelo, String corVestido, String pais, String animalAmigo) {
        super(nome, corCabelo, corVestido, pais); // chama construtor da classe base
        this.animalAmigo = animalAmigo;
    }

    // Implementação do método abstrato
    @Override
    public void apresentar() {
        System.out.println("Olá, eu sou " + nome + " da floresta mágica de " + pais + ". Meu cabelo é " + corCabelo +
                           " e adoro meu amigo " + animalAmigo + "!");
    }

    // Método exclusivo da princesa da floresta
    public void conversarComAnimal() {
        System.out.println(nome + " conversa com " + animalAmigo + " na floresta.");
    }
}
