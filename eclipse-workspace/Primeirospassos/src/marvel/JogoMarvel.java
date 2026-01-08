package marvel;

public class JogoMarvel {

    public static void main(String[] args) {

        // POLIMORFISMO
        Poder heroi1 = new HomemDeFerro();
        Poder heroi2 = new CapitaoAmerica();

        heroi1.usarPoder();
        heroi2.usarPoder();

        // método default
        heroi1.recarregar();

        // método static
        Poder.aviso();

        // LAMBDA (Interface Funcional)
        PoderEspecial estaloDoThanos = () ->
                System.out.println("🫰 Thanos estala os dedos!");

        estaloDoThanos.ativar();
    }
}
