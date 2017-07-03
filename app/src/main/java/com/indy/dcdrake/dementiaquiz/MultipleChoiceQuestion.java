package com.indy.dcdrake.dementiaquiz;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by dcdrake on 7/2/17.
 */

public class MultipleChoiceQuestion implements Serializable
{
    private ArrayList<SingleAnswer> answers;
    private String question_text;

    private boolean next_question_is_true_false;

    MultipleChoiceQuestion(String question_text_in, int number_of_answer_choices, boolean next_question_is_true_false_in)
    {
        answers = new ArrayList<SingleAnswer>(number_of_answer_choices);
        question_text = question_text_in;
        next_question_is_true_false = next_question_is_true_false_in;
    }

    public void addAnswerChoice(String text, int point_value)
    {
        SingleAnswer new_answer = new SingleAnswer(text, point_value);
        answers.add(new_answer);
    }

    public SingleAnswer getAnswerByIndex(int index)
    {
        return answers.get(index);
    }

    public int getNumberOfAnswerChoices()
    {
        return answers.size();
    }

    public String getQuestionText()
    {
        return question_text;
    }

    public boolean getNextQuestionIsTrueFalse()
    {
        return next_question_is_true_false;
    }
}
