package com.indy.dcdrake.dementiaquiz;

import java.io.Serializable;

/**
 * Created by dcdrake on 6/17/17.
 */

public class SingleAnswer implements Serializable
{
    private Integer point_value;
    private boolean is_selected;
    private String  answer_text;

    SingleAnswer(String answer_text_in, int point_value_in)
    {
        answer_text = answer_text_in;
        point_value = point_value_in;
        is_selected = false;
    }

    public int getPointValue()
    {
        return point_value;
    }

    public void setSelected(boolean new_value)
    {
        is_selected = new_value;
    }

    public boolean getSelected()
    {
        return is_selected;
    }

    public String getAnswerText()
    {
        return answer_text;
    }
}
