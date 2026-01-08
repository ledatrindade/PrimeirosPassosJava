interface Heroi {
    void salvarMundo();
    void lutarContraVilao();
    void usarArma();
}

class HomemDeFerro implements Heroi {
    public void salvarMundo() {
        System.out.println("Construo uma armadura incrível e salvo a Terra!");
    }
    public void lutarContraVilao() {
        System.out.println("Luto contra Thanos com repulsores!");
    }
    public void usarArma() {
        System.out.println("Uso meus lasers!");
    }
}

class CapitaoAmerica implements Heroi {
    public void salvarMundo() {
        System.out.println("Uso meu escudo para proteger todos!");
    }
    public void lutarContraVilao() {
        System.out.println("Luto contra o exército inimigo!");
    }
    public void usarArma() {
        System.out.println("Lancio o escudo com precisão!");
    }
}

public class Jogo {
    public static void main(String[] args) {
        Heroi[] herois = {new HomemDeFerro(), new CapitaoAmerica()};
        for(Heroi heroi : herois) {
            heroi.salvarMundo();
            heroi.lutarContraVilao();
            heroi.usarArma();
            System.out.println("---");
        }
    }
}