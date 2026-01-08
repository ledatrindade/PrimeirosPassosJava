package mapWrappers;

public class WrappersExemplo {

    public static void main(String[] args) {

        Integer idade = 18;
        Double altura = 1.75;
        Boolean heroi = true;
        Character inicial = 'M';

        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println(heroi);
        System.out.println(inicial);


        System.out.println("Idade como String: " + idade.toString());
        System.out.println("Comparação: " + idade.compareTo(20));
    }
}

