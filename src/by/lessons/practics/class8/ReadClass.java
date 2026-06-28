package by.lessons.practics.class8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ReadClass {
    public void readFromFile(File filePath) {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String text = br.readLine();
            System.out.println(text);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("ERROR");
        }
    }
}
