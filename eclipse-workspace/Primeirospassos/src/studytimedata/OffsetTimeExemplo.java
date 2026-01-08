package studytimedata;

import java.time.OffsetTime;
import java.time.ZoneOffset;

public class OffsetTimeExemplo {

    public static void main(String[] args) {

        OffsetTime hora = OffsetTime.now(ZoneOffset.of("-03:00"));

        System.out.println(hora);
    }
}

