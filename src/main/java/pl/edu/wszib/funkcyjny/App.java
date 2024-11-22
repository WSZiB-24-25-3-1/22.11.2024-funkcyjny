package pl.edu.wszib.funkcyjny;

import java.util.*;

public class App {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("Janusz");
        names.add("Zbyszek");
        names.add("Adam");
        names.add("Wiesiek");
        names.add("Karol");

        System.out.println(names);

        Collections.sort(names);

        System.out.println(names);

        List<Car> cars = new ArrayList<>();
        cars.add(new Car("BMW", "3", "KR22", 300));
        cars.add(new Car("Toyota", "Corolla", "KR11", 200));
        cars.add(new Car("Honda", "Civic", "KR44", 150));
        cars.add(new Car("Audi", "A3", "KR33", 400));

        System.out.println(cars);

        Collections.sort(cars, new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.getBrand().compareTo(o2.getBrand());
            }
        });

        System.out.println(cars);

        Collections.sort(cars, new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o2.getPrice() - o1.getPrice();
            }
        });

        System.out.println(cars);

        SomeInterface someInterface = new SomeInterface() {
            @Override
            public void x() {

            }

            @Override
            public void y() {

            }
        };
    }
}
