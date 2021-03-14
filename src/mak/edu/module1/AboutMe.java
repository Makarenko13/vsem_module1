package mak.edu.module1;
/**
  @author   Yelyzaveta Makarenko
  @project   vsem_module_1
  @class  AboutMe
  @version  1.0.0
  @since 14.03.2021 - 10.38
*/

public class AboutMe {
    public static void main(String[] args) {
        System.out.println("Facts about me:");
        byte myAge = 21;
        System.out.println("1." + " My age is " + myAge + " years.");

        short myYearOfBirth = 1999;
        System.out.println("2." + " I was born in "
                + myYearOfBirth + " year.");

        int myFavoriteNumber = 1_000_000;
        System.out.println("3."+ " My favorite number is "
                + myFavoriteNumber + ".");

        long generalPopulationOfMyCounty = 410_000_000l;
        System.out.println("4." + " The population of my country is "
                + generalPopulationOfMyCounty + " people.");

        float myHeight = 156.5f;
        System.out.println("5." + " My height is " + myHeight
                + " cm.");

        double myWeight = 50.2;
        System.out.println("6." + " My weight is " + myWeight
                + "kg.");

        char firstLatterOfMyName = 'L';
        System.out.println("7." + " The first letter of my name is "
                + firstLatterOfMyName + ".");

        boolean myFirstProject = true;
        System.out.println("8." + " This is my first project. It's "
                + myFirstProject + ".");

        String str = "Thanks for attention!";
        System.out.println(str);
    }
}
