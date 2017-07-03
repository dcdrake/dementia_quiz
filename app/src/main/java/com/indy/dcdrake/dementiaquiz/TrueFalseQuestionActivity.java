package com.indy.dcdrake.dementiaquiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.FrameLayout;
import android.widget.TextView;

import static com.indy.dcdrake.dementiaquiz.R.id.question;

public class TrueFalseQuestionActivity extends AppCompatActivity
{
    private QuestionManager question_manager;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_true_false_question);

        Intent intent = getIntent();
//        int active_question = intent.getIntExtra("active_question_number", 0);
        question_manager = (QuestionManager) intent.getSerializableExtra("question_manager");

        TextView question_text = (TextView) findViewById(question);

        question_text.setHeight(FrameLayout.LayoutParams.MATCH_PARENT);
    }
}
