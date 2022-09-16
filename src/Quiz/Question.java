package Quiz;

import java.util.ArrayList;
import java.util.HashMap;

public abstract class Question {
    private int pointValue;
    private String question;

    public Question(int pointValue, String question){
        this.pointValue = pointValue;
        this.question = question;

    }
    public void displayQuestion(){
        System.out.println(question);
    }

    public void setPointValue(int pointValue) {
        this.pointValue = pointValue;
    }

    public int getPointValue(){
        return this.pointValue;
    }

    public abstract void displaysAnswers();

    public abstract int getAnswers();

}
