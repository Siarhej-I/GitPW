package by.lessons.practics.class8;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteClass {

    public void writeInFile(String txt, File file) {
        try (FileWriter filW = new FileWriter(file);) {
            filW.write(txt);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("ERROR");
        }
    }
}
