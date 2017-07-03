package com.indy.dcdrake.dementiaquiz;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by dcdrake on 7/2/17.
 */

public class TrueFalseQuestion implements Serializable
{

    private ArrayList<TrueFalseAnswer> answers;
    private String question_text;

    TrueFalseQuestion(String question_text_in, int number_of_answer_choices)
    {
        answers = new ArrayList<>(number_of_answer_choices);
        question_text = question_text_in;
    }

    public void addPartOfQuestion(String text)
    {
        TrueFalseAnswer answer = new TrueFalseAnswer(text);
        answers.add(answer);
    }

    public String getQuestionText()
    {
        return question_text;
    }
}
