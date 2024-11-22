package pl.edu.wszib.funkcyjny;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class App5 {
    public static void main(String[] args) {
        Optional<Car> carBox = find("Audi");
        if(carBox.isPresent()) {
            System.out.println(carBox.get().getPlate());
        }


        Optional<Car> carBox2 = find("Polonez");
        if(carBox2.isPresent()) {
            System.out.println(carBox2.get().getPlate());
        }
    }

    public static Optional<Car> find(String brand) {
        List<Car> cars = new ArrayList<Car>();
        cars.add(new Car("BMW", "3", "KR22", 300));
        cars.add(new Car("Toyota", "Corolla", "KR11", 200));
        cars.add(new Car("Honda", "Civic", "KR44", 150));
        cars.add(new Car("Audi", "A3", "KR33", 400));

        for(Car car : cars) {
            if(car.getBrand().equals(brand)) {
                return Optional.of(car);
            }
        }

        return Optional.empty();
    }
}
