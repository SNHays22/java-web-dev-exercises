package Quiz;

import java.util.ArrayList;
import java.util.Scanner;

public class Checkbox extends Question{

    private ArrayList<Integer> correctAnswers;
    private ArrayList<String> possibleAnswers;

    public Checkbox(int pointValue, String question, ArrayList<Integer> correctAnswers, ArrayList<String> possibleAnswers){
        super(pointValue, question);
        this.correctAnswers = correctAnswers;
        this.possibleAnswers = possibleAnswers;
    }

    @Override
    public void displaysAnswers() {
        for(int i=0; i<possibleAnswers.size(); i++){
            System.out.println(possibleAnswers.get(i));
        }

    }

    public int checkAnswers(ArrayList<Integer> check){
        int answersCorrect = 0;
        for (int i = 0; i<check.size(); i++){
            if(correctAnswers.contains(check.get(i))){
                answersCorrect++;
            }
        }
        return  answersCorrect;
    }



    @Override
    public int getAnswers(){
        ArrayList<Integer> usersAnswers = new ArrayList<>();
        System.out.println("For this question, there are multiple correct answers. To begin answering the question, enter 'y'.");
        Scanner userContinue = new Scanner(System.in);
        String goingToContinue = userContinue.nextLine();
        while(goingToContinue.indexOf('y') >= 0 && usersAnswers.size() <= possibleAnswers.size()){
            System.out.println("What will your answer be? Enter the number of the option you believe is correct. For example, to select the first option, enter 1");
            Scanner userAnswer = new Scanner(System.in);
            String answer = userAnswer.nextLine();
            int option = Integer.parseInt(answer);
            usersAnswers.add(option);

            System.out.println("For this question, there are multiple correct answers. To begin answering the question, enter 'y'.");
            goingToContinue = userContinue.nextLine();
        }
    return checkAnswers(usersAnswers);
    }


}
