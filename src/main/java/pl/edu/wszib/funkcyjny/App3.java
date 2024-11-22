package pl.edu.wszib.funkcyjny;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class App3 {
    public static void main(String[] args) {
        loadAndSave(App3::loadDataFromDb, App3::saveDataToDB);
        loadAndSave(App3::loadDataFromJSON, App3::saveDataToFile);
        loadAndSave(App3::loadDataFromFile, App3::saveDataToDB);
    }

    public static void loadAndSave(Supplier<Integer> loader, Consumer<Integer> saver) {
        int x = loader.get();
        saver.accept(x);
    }

    private static int loadDataFromDb() {
        return 1;
    }

    private static int loadDataFromFile() {
        return 2;
    }

    private static int loadDataFromJSON() {
        return 3;
    }

    private static void saveDataToDB(int i) {
        System.out.println("Saving to database: " + i);
    }

    private static void saveDataToFile(int i) {
        System.out.println("Saving to file: " + i);
    }

    private static void saveDataToJSON(int i) {
        System.out.println("Saving to JSON: " + i);
    }
}
