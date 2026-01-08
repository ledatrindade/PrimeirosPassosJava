package disney;

// Subclasse que herda de Princesa
public class PrincesaCastelo extends Princesa {

    private String baileFavorito;

    // Construtor
    public PrincesaCastelo(String nome, String corCabelo, String corVestido, String pais, String baileFavorito) {
        super(nome, corCabelo, corVestido, pais);
        this.baileFavorito = baileFavorito;
    }

    // Implementação do método abstrato
    @Override
    public void apresentar() {
        System.out.println("Olá, eu sou " + nome + " do castelo de " + pais + ". Amo meu vestido " + corVestido +
                           " e meu baile favorito é " + baileFavorito + "!");
    }

    // Método exclusivo da princesa do castelo
    public void dançar() {
        System.out.println(nome + " está dançando no baile " + baileFavorito + "!");
    }
}
