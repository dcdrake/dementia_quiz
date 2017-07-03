package com.indy.dcdrake.dementiaquiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class TrueFalseQuestionActivity extends AppCompatActivity
{
    private QuestionManager question_manager;
    TrueFalseQuestion current_question;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_true_false_question);

        Intent intent = getIntent();
        question_manager = (QuestionManager) intent.getSerializableExtra("question_manager");
        current_question = question_manager.getNextTrueFalseQuestion();

        TextView question_text = (TextView) findViewById(R.id.question_text);
        question_text.setText(current_question.getQuestionText());
    }
}
