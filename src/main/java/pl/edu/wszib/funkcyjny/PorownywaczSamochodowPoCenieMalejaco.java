package pl.edu.wszib.funkcyjny;

import java.util.Comparator;

public class PorownywaczSamochodowPoCenieMalejaco implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        return -(o1.getPrice() - o2.getPrice());
    }
}
