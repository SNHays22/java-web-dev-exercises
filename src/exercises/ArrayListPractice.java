package exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.SimpleTimeZone;

public class ArrayListPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> someInts = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        System.out.println(sumEven(someInts));
        String phrase ="I would not, could not, in a box. "
                + "I would not, could not with a fox. "
                + "I will not eat them in a house. "
                + "I will not eat them with a mouse.";

        String newPhrase = phrase.replaceAll("\\.", "");
        ArrayList<String> wordList = new ArrayList<>(Arrays.asList(newPhrase.split(" ")));
        System.out.println("Enter a word length: ");
        int numChars = input.nextInt();
        printFiveLetterWords(wordList, numChars);
    }
    public static Integer sumEven(ArrayList<Integer> myArray){
       int total = 0;
          for(int integer: myArray){
            if(integer%2 == 0){
                    total += integer;
                }
          }
          return total;
    }

    public static void printFiveLetterWords(ArrayList<String> arr, int numChars){
        for(String word: arr){
            if(word.length() == numChars){
                System.out.println(word);
            }
        }
    }

}
