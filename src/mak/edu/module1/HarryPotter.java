package mak.edu.module1;/*
  @author   Yelyzaveta Makarenko
  @project   vsem_module_1
  @class  HarryPotter
  @version  1.0.0
  @since 14.03.2021 - 20.55
*/
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Array;
import java.sql.SQLOutput;

public class HarryPotter {


    public static void main(String[] args) throws IOException {

        // download a content
        String content = new String(Files.readAllBytes(Paths.get
                ("C:\\Users\\User\\IdeaProjects\\vsem_module_1\\out\\production" +
                        "\\vsem_module_1\\mak\\edu\\harry.txt")));
        System.out.println(content.substring(0, 100));
        System.out.println(content.length());
        content = content.replaceAll("[^A-Za-z ' ]", "");



        String[] words = content.split(" ");
        System.out.println(words.length);

        for (int i = 0; i < 100; i++) {
               }
        int counter = 0;
        for (int i = 0; i < words.length ; i++) {
            if(words[i].length() == 12) {
                counter++;
            }
        }


        String stringOfDistincts = "";

        for (int i = 0; i < words.length; i++) {
            if (!stringOfDistincts.contains(words[i])) {
                stringOfDistincts += words[i] + " ";
            }
        }

    }
}

