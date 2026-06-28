package by.lessons.practics.class8;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class FarmMain {
    public static void main(String[] args) {

        Farm an1 = new Farm("Бальтазар", 5);
        Farm an2 = new Farm("Кроха", 7);

        List<Farm> farms = new ArrayList<>();
        farms.add(an1);
        farms.add(an2);

        serialize(farms,"src/by/lessons/practics/class8/folder/anFarm.txt");

        List<Farm> farmsOut = deserialize("src/by/lessons/practics/class8/folder/anFarm.txt");
        System.out.println(farmsOut);

    }

    static String serialize(List<Farm> farm, String file) {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file))) {
            objectOutputStream.writeObject(farm);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return file;
    }

    static List<Farm> deserialize(String file) {
        List<Farm> farm = null;
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file))) {
            farm = (List<Farm>) objectInputStream.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return farm;
    }
}
