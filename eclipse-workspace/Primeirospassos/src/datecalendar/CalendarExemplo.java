package datecalendar;

import java.util.Calendar;

public class CalendarExemplo {

    public static void main(String[] args) {

        Calendar hoje = Calendar.getInstance();
        
        // usando set (mudar)
        hoje.set(Calendar.DAY_OF_MONTH, 10);
        hoje.set(Calendar.MONTH, 2);
        hoje.set(Calendar.YEAR, 2025);

        int dia = hoje.get(Calendar.DAY_OF_MONTH);
        int mes = hoje.get(Calendar.MONTH) + 1; // começa em 0
        int ano = hoje.get(Calendar.YEAR);

        System.out.println("Data atual:");
        System.out.println(dia + "/" + mes + "/" + ano);
    }
}

