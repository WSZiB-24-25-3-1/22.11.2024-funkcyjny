package pl.edu.wszib.funkcyjny;

import java.util.function.*;

public class App2 {
    public static void main(String[] args) {
        Function<String, Integer> function = String::length;

        System.out.println(function.apply("Mateusz"));
        System.out.println(function.apply("Jan"));
        System.out.println(function.apply("Zbyszek"));

        UnaryOperator<String> unaryOperator = s -> s + "Cos !!!";

        System.out.println(unaryOperator.apply("Mateusz"));

        BiFunction<String, Integer, Double> biFunction = (s, i) -> (s.length() + i) * 4.5;

        System.out.println(biFunction.apply("Janusz", 5));

        Predicate<String> predicate = s -> s.length() > 5;

        System.out.println(predicate.test("Mateusz"));
        System.out.println(predicate.test("Jan"));

        Consumer<Car> consumer = car -> System.out.println(car.getBrand());

        consumer.accept(new Car("BMW", "3", "KR22", 300));

        Supplier<Car> supplier = () -> new Car("default", "default",
                "default", 0);

        System.out.println(supplier.get());

        TriFunction<String, Integer, Double, Boolean> triFunction = (s, i, d) -> {
          if(i > 5) {
              return (s.length() * d) > 20;
          } else {
              return false;
          }
        };
        System.out.println(triFunction.apply("Janusz", 10, 3.3));

        Consumer<String> consumer2 = System.out::println;
    }
}
