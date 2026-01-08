package apis;

import java.util.ArrayList;
import java.util.List;

public class StreamsComGenerics {

    public static void main(String[] args) {

        List<Integer> poderes = new ArrayList<>();
        poderes.add(80);
        poderes.add(95);
        poderes.add(60);
        poderes.add(100);

        poderes.stream()
               .filter(p -> p >= 90)
               .forEach(System.out::println);
    }
}

