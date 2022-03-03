package ml.wonwoo.javafeatures;

import java.util.List;
import java.util.stream.Stream;

public class Streams {

    public static void main(String[] args) {

        List<Integer> numbers = Stream.of(1, 2, 3, 4, 5).toList();
        System.out.println(numbers);

        System.out.println(Stream.of(1, 2, 3, 4, 5)
                .mapMulti((number, consumer) -> {
                    if (number % 2 == 0) {
                        consumer.accept(number * 2);
                    } else {
                        consumer.accept(number);
                    }
                }).toList());
    }
}
