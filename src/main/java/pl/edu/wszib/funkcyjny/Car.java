package pl.edu.wszib.funkcyjny;

public class Car {
    private String brand;
    private String model;
    private String plate;
    private int price;

    public Car(String brand, String model, String plate, int price) {
        this.brand = brand;
        this.model = model;
        this.plate = plate;
        this.price = price;
    }

    public Car() {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", plate='" + plate + '\'' +
                ", price=" + price +
                '}';
    }
}
