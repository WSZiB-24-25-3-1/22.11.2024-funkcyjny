package pl.edu.wszib.funkcyjny;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App4 {
    public static void main(String[] args) {
        List<Integer> integers =
                List.of(1, 0, 2, 3, 4, 5, 6, 0, 5, 7, 9, 4, 11, 10, 15);

        Stream<Integer> stream = integers.stream()
                .filter(i -> i > 5);
        Stream<Integer> peek = stream.filter(i -> i < 10);
        Stream<Integer> distinct = peek.distinct();

        //??
        //??

        ///??
        Stream<Integer> sorted = distinct.sorted();

        //??
        //??
                sorted.peek(System.out::println).toList();

        integers.stream().max(Comparator.naturalOrder());
    }
}
