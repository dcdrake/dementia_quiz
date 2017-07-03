package com.indy.dcdrake.dementiaquiz;

import java.io.Serializable;

/**
 * Created by dcdrake on 7/2/17.
 */

public class TrueFalseAnswer implements Serializable
{
    public enum SelectedState
    {
        UNSELECTED,
        TRUE,
        FALSE,
        INVALID_STATE
    }

    SelectedState state;
    String text;

    TrueFalseAnswer(String answer_text_in)
    {
        state = SelectedState.UNSELECTED;
        text = answer_text_in;
    }

    public SelectedState getCurrentState()
    {
        return state;
    }

    public void setCurrentState(SelectedState new_state)
    {
        state = new_state;
    }

}
