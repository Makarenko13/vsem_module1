package mak.edu.module4;/*
  @author   Yelyzaveta Makarenko
  @project   vsem_module_1
  @class  Logs
  @version  1.0.0
  @since 12.04.2021 - 14.48
*/

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.List;


public class Logs {

    public static void main (String[] args) throws IOException{
        LocalDateTime start = LocalDateTime.now();
        String logs = new String(Files.readAllBytes(Paths.get("Users/User/OneDrive/Рабочий стол/logs2019.txt")));
        final String[] lines = logs.split("\n");
        System.out.println(lines.length);

        int counter = 0;
        for (int i = 0; i < lines.length; i++) {
            if (lines[i].contains("ERROR"))counter++;
        }
        System.out.println("ERRORS  -  " + counter);            //PRINT 1
        
        LocalDateTime finish = LocalDateTime.now();
        System.out.println(ChronoUnit.MILLIS.between(finish, start));


        System.out.println("----------------------------------------------------------------");
        start = LocalDateTime.now();

        System.out.println(Files.readAllLines(Paths.get("Users/User/OneDrive/Рабочий стол/logs2019.txt"))
                .stream().filter(line -> line.contains("ERROR")).count());

        finish = LocalDateTime.now();

        System.out.println(ChronoUnit.MILLIS.between(finish, start));
    }
}
