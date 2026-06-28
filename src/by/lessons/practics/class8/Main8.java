package by.lessons.practics.class8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.charset.StandardCharsets;

public class Main8 {
    public static void main(String[] args) {

        String txt = "Сериализация объектов - это процесс сохранения состояния объектов в виде последовательности байтов, а также процесс восстановления в дальнейшем из этих байтов \"живых\" объектов. Java Serialization API предоставляет разработчикам Java стандартный механизм управления сериализацией объектов. API мал и легок в применении, а его классы и методы просты для понимания.";
        File pathOtnos = new File("src/by/lessons/practics/class8/folder/class8.txt");
        File pathAbsol = new File("f:\\java_workspace", "1class8.txt");

        WriteClass wrC = new WriteClass();
        //wrC.writeInFile(txt,pathAbsol);

        ReadClass rC = new ReadClass();
        rC.readFromFile(pathOtnos);
    }



}
