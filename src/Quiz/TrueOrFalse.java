package Quiz;

import java.util.Scanner;

public class TrueOrFalse extends Question{

    private boolean correctAnswer;

    public TrueOrFalse(int pointValue, String question, boolean correctAnswer){
        super(pointValue,question);
        setPointValue(1);
        this.correctAnswer = correctAnswer;
    }

    public boolean isCorrectAnswer(boolean possibleAnswer){
        if(possibleAnswer == correctAnswer){
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public void displaysAnswers(){
        System.out.println("True or False");
    }

    @Override
    public int getAnswers(){
        Scanner answer = new Scanner(System.in);
        System.out.println("What will your answer be? Type 't' for True and 'f' for False");
        String userAnswer = answer.nextLine();
        if(userAnswer.indexOf('t')>=0){
            if(isCorrectAnswer(true)){
                return 1;
            }
            else{
                return 0;
            }
        }
        else{
            if(isCorrectAnswer(false)){
                return 1;
            }
            else {
                return 0;
            }
        }
    }

}
