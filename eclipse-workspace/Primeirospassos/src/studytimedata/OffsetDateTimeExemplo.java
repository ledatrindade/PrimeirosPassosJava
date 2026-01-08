package studytimedata;

import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public class OffsetDateTimeExemplo {

    public static void main(String[] args) {

        OffsetDateTime agora = OffsetDateTime.now(ZoneOffset.of("-03:00"));

        System.out.println(agora);
    }
}

