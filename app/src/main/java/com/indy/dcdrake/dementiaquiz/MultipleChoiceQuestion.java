package com.indy.dcdrake.dementiaquiz;

import java.util.ArrayList;

/**
 * Created by dcdrake on 6/17/17.
 */

public class MultipleChoiceQuestion {

    private String question_text;
    private ArrayList<Answer> answers = new ArrayList<Answer>(5);

    MultipleChoiceQuestion(String question_text_in)
    {
        question_text = question_text_in;
    }

    public String getQuestionText()
    {
        return question_text;
    }

    public void addAnswerChoice(String text, int point_value)
    {
        Answer new_answer = new Answer(text, point_value);
        answers.add(new_answer);
    }

    public Answer getAnswerByIndex(int index)
    {
        return answers.get(index);
    }

    public int getNumberOfAnswers()
    {
        return answers.size();
    }
}
