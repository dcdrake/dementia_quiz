package com.indy.dcdrake.dementiaquiz;

import java.util.ArrayList;

/**
 * Created by dcdrake on 7/2/17.
 */

public class TrueFalseQuestion {

    private ArrayList<Answer> answers;
    private String question_text;

    TrueFalseQuestion(String question_text_in, int number_of_answer_choices)
    {
        super();

        answers = new ArrayList<>(number_of_answer_choices);
        question_text = question_text_in;
    }
}
