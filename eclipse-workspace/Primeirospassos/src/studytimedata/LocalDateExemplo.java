package studytimedata;

import java.time.LocalDate;

public class LocalDateExemplo {

    public static void main(String[] args) {

        LocalDate hoje = LocalDate.now();

        System.out.println("Hoje é: " + hoje);

        int dia = hoje.getDayOfMonth();
        int mes = hoje.getMonthValue();
        int ano = hoje.getYear();

        System.out.println(dia + "/" + mes + "/" + ano);
    }
}

