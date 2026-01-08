package apis;

import java.util.Arrays;
import java.util.List;

public class StreamsExemplo {

    public static void main(String[] args) {

        List<String> herois = Arrays.asList(
                "Thor",
                "Homem de Ferro",
                "Hulk",
                "Capitão América"
        );

        herois.stream()
              .filter(h -> h.length() > 4)
              .forEach(System.out::println);
    }
}

