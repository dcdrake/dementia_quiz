package com.indy.dcdrake.dementiaquiz;

/**
 * Created by dcdrake on 7/2/17.
 */

public class Answer
{
    private String  answer_text;

    Answer(String answer_text_in)
    {
       answer_text = answer_text_in;
    }

    public String getAnswerText()
    {
        return answer_text;
    }


}
