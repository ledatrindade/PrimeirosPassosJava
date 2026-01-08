package studytimedata;

import java.time.LocalTime;

public class LocalTimeExemplo {

    public static void main(String[] args) {

        LocalTime agora = LocalTime.now();

        System.out.println("Agora são: " + agora);

        int hora = agora.getHour();
        int minuto = agora.getMinute();

        System.out.println(hora + ":" + minuto);
    }
}
