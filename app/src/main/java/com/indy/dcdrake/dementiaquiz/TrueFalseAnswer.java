package com.indy.dcdrake.dementiaquiz;

/**
 * Created by dcdrake on 7/2/17.
 */

public class TrueFalseAnswer extends Answer
{
    public enum SelectedState
    {
        UNSELECTED,
        TRUE,
        FALSE,
        INVALID_STATE
    }

    SelectedState state;
//    int point_value;

    TrueFalseAnswer(String answer_text_in)
    {
        super(answer_text_in);

        state = SelectedState.UNSELECTED;
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
