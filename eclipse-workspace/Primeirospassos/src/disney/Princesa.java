package disney;

// Classe abstrata: base para todas as princesas
public abstract class Princesa {
    protected String nome;
    protected String corCabelo;
    protected String corVestido;
    protected String pais;

    // Construtor
    public Princesa(String nome, String corCabelo, String corVestido, String pais) {
        this.nome = nome;
        this.corCabelo = corCabelo;
        this.corVestido = corVestido;
        this.pais = pais;
    }

    // Método abstrato: cada princesa vai se apresentar de forma diferente
    public abstract void apresentar();

    // Método concreto: informações básicas
    public void detalhes() {
        System.out.println("Nome: " + nome);
        System.out.println("Cabelo: " + corCabelo);
        System.out.println("Vestido: " + corVestido);
        System.out.println("País: " + pais);
    }
}
