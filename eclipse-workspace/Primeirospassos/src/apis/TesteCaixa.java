package apis;

public class TesteCaixa {
	
    public static void main(String[] args) {

        Caixa<String> caixaTexto = new Caixa<>();
        caixaTexto.guardar("Mjolnir");

        Caixa<Integer> caixaNumero = new Caixa<>();
        caixaNumero.guardar(100);

        System.out.println(caixaTexto.abrir());
        System.out.println(caixaNumero.abrir());
    }

}
