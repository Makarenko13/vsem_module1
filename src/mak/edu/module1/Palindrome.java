package mak.edu.module1;
/**
  @author   Yelyzaveta Makarenko
  @project   vsem_module_1
  @class  Palindrome
  @version  1.0.0
  @since 14.03.2021 - 10.41
*/

import java.util.Locale;

public class Palindrome {


    public static boolean isPalindrome1(String firstSentence) {
        firstSentence = firstSentence.replaceAll("[^A-Za-zA-Ая-я]", "");
        firstSentence = firstSentence.toLowerCase();

        boolean result = true;
        for (int i = 0; i < firstSentence.length(); i++) {
            if(firstSentence.charAt(i)
                    != firstSentence.charAt(firstSentence.length() -1 -i )){

                result = false;
                break;
            }
        }
        return result;



    // build a reverse string
    }public static boolean isPalindrome2(String secondSentence) {
        secondSentence = secondSentence.replaceAll("[^A-Za-zA-Ая-я]", "");
        secondSentence = secondSentence.toLowerCase();


        String reversed = "";
        for (int i = secondSentence.length() - 1; i >= 0; i--) {
            reversed += secondSentence.charAt(i);

        }
        return reversed.equals(secondSentence);
    }



    // StringBuilder
    public static boolean isPalindrome3(String thirdSentence) {
        thirdSentence = thirdSentence.replaceAll("[^A-Za-zA-Ая-я]", "");
        thirdSentence = thirdSentence.toLowerCase();

        StringBuilder builder = new StringBuilder(thirdSentence);
        String reversed = builder.reverse().toString();
        boolean result = false;
        if(thirdSentence.equals(reversed)) {
            result = true;
        }
        return true;
    }




    public static void main(String[] args) {
        String firstSentence = "Молоко делили ледоколом";
        String secondSentence ="Морда казака за кадром";
        String thirdSentence = "Миром ум уморим";

        System.out.println("The first way:");
        System.out.println( firstSentence + " is a palindrome - "
                + isPalindrome1(firstSentence));

        System.out.println("The second way:");
        System.out.println( secondSentence + " is a palindrome - "
                + isPalindrome2(secondSentence));

        System.out.println("The third way:");
        System.out.println( thirdSentence + " is a palindrome - "
                + isPalindrome3(thirdSentence));

    }
}
