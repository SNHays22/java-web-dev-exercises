package CountingCharactersStudio;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingCharacters {
    public static void main(String[] args) {

        String defaultText = "If the product of two terms is zero then " +
                "common sense says at least one of the two terms has " +
                "to be zero to start with. So if you move all the " +
                "terms over to one side, you can put the quadratics " +
                "into a form that can be factored allowing that " +
                "side of the equation to equal zero. " +
                "Once you’ve done that, it’s pretty straightforward " +
                "from there.";

        Scanner input = new Scanner(System.in);
        char[] charString;

        HashMap<Character, Integer> charCount = new HashMap<>();

        System.out.println("Please enter text or hit ENTER for default text: ");
        String inputText = input.nextLine();

        String newDefault = defaultText.replaceAll("[^A-Za-z]", "");
        String newInput = inputText.replaceAll("[^A-Za-z]", "");

        if(inputText.equals("")){
            charString = newDefault.toLowerCase().toCharArray();
        }else{
            charString = newInput.toLowerCase().toCharArray();
        }



        for(char letter: charString){
            if(charCount.containsKey(letter)){
                charCount.put(letter, charCount.get(letter) + 1);
            }
            else{
                charCount.put(letter, 1);
            }
        }

        for(Map.Entry<Character, Integer> oneChar: charCount.entrySet()){
            System.out.println(oneChar.getKey() + ":" + oneChar.getValue());
        }

    }
}
