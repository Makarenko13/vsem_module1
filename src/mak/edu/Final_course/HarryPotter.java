package mak.edu.Final_course;/*
  @author   Makarenko Yelyzaveta
  @project   vsem_module_1
  @class  HarryPotter
  @version  1.0.0
  @since 19.04.2021 - 18.24
*/

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HarryPotter {
    private static Object HarryPotter;
    String content = new String(Files.readAllBytes(Paths.get
            ("C:\\Users\\User\\IdeaProjects\\vsem_module_1\\out\\production" +
                    "\\vsem_module_1\\mak\\edu\\harry.txt")));
    Map<String, Integer> map = new TreeMap<>(Collections.reverseOrder());

    for(
    int i = 0;
    i<array.length;i++)

    {
        if (map.containsKey(array[i]))
            map.put(array[i], map.get(array[i]) + 1);
        else map.put(array[i], 1);
    }


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


    public static void main(String[] args) {
        String content = new String(Files.readAllBytes(Paths.get
                ("C:\\Users\\User\\IdeaProjects\\vsem_module_1\\out\\production" +
                        "\\vsem_module_1\\mak\\edu\\harry.txt")));
        Pattern pattern = Pattern.compile("A.+a");
        Matcher matcher = pattern.matcher(HarryPotter);
        while (matcher.find()) {
            System.out.println(HarryPotter.substring(matcher.start(), matcher.end()));
        }

    }


    public class FrequencySort {
        public void main(String[] args) {
            int[] ar = new int
        }

        ;

        Map<Integer, Integer> numbers = new HashMap<>();

            for(
        int number :ar)

        {
            if (numbers.containsKey(number)) {
                Integer count = numbers.get(number);
                numbers.put(number, ++count);
            } else {
                numbers.put(number, 1);
            }
        }

        final class FrequencyComparator implements Comparator<Integer> {
            Map<Integer, Integer> refMap;

            public FrequencyComparator(Map<Integer, Integer> base) {
                this.refMap = base;
            }

            @Override
            public int compare(Integer k1, Integer k2) {
                Integer val1 = refMap.get(k1);
                Integer val2 = refMap.get(k2);

                int num = val1.compareTo(val2);
                return num == 0 ? k1.compareTo(k2) : num;
            }
        }

        FrequencyComparator comp = new FrequencyComparator(numbers);
        TreeMap<Integer, Integer> sortedMap = new TreeMap<Integer, Integer>(comp);
            sortedMap.putAll(numbers);
            for(
        Integer i :sortedMap.keySet())

        {
            int frequencey = sortedMap.get(i);
            for (int count = 1; count <= frequencey; count++) {
                System.out.print(i + " ");
            }
        }
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Name is - ");
        String s = scan.nextLine();
        List<String> result = new ArrayList<>();

        for (String word : s.split("Harry Potter")) {
            if (word.substring(0, 1).toUpperCase().equals(word.substring(0, 1)))
                result.add(word);
        }
        result.stream().sorted().forEach(System.out::println);
    }










    public static void main(String[] args) throws Exception
    {
        String content = new String(Files.readAllBytes(Paths.get
                ("C:\\Users\\User\\IdeaProjects\\vsem_module_1\\out\\production" +
                        "\\vsem_module_1\\mak\\edu\\harry.txt")));
        System.out.println(content.substring(0, 100));
        System.out.println(content.length());
        content = content.replaceAll("[^A-Za-z ' ]", "");
        Scanner in = new Scanner(System.in);
        System.out.print("Words:  ");
        while (!in.hasNextInt()) {
            System.out.println("Only integer. Try again!");
            in.next();
        }
        n = in.nextInt();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] array = new String[n];
        System.out.println("Words: ");
        for (int i = 0; i < array.length; i++)
        {
            array[i] = reader.readLine();
        }
        sort(array);
        System.out.println("arrange in alphabetic order: ");
        for (String x : array)
        {
            System.out.println(x);
        }
    }








        public class Characters{
            private String firstName;
            private String lastName;


            public Characters() {
            }

            public Characters(String firstName, String lastName) {
                this.firstName = firstName;
                this.lastName = lastName;
            }

            public String getFirstName() {
                return firstName;
            }

            public void setFirstName(String firstName) {
                this.firstName = firstName;
            }

            public String getLastName() {
                return lastName;
            }

            public void setLastName(String lastName) {
                this.lastName = lastName;
            }
        }


}
