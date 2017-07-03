package com.indy.dcdrake.dementiaquiz;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static com.indy.dcdrake.dementiaquiz.R.id.next_question;
import static com.indy.dcdrake.dementiaquiz.R.id.question;

public class MultipleChoiceQuestionActivity extends AppCompatActivity {

    private QuestionManager question_manager;
    int current_question_number;
    MultipleChoiceQuestion current_question;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiple_choice_question);

        Intent intent = getIntent();
        int active_question = intent.getIntExtra("active_question_number", 0);
        question_manager = (QuestionManager) intent.getSerializableExtra("question_manager");

        current_question_number = active_question;


        current_question = question_manager.getQuestionByIndex(current_question_number);

        TextView question_text = (TextView) findViewById(question);
        Button button1 = (Button)findViewById(R.id.choice1);
        Button button2 = (Button)findViewById(R.id.choice2);
        Button button3 = (Button)findViewById(R.id.choice3);
        Button button4 = (Button)findViewById(R.id.choice4);
        Button button5 = (Button)findViewById(R.id.choice5);

        question_text.setText(current_question.getQuestionText());
        button1.setText(current_question.getAnswerByIndex(0).getAnswerText());
        button2.setText(current_question.getAnswerByIndex(1).getAnswerText());
        button3.setText(current_question.getAnswerByIndex(2).getAnswerText());
        button4.setText(current_question.getAnswerByIndex(3).getAnswerText());
        button5.setText(current_question.getAnswerByIndex(4).getAnswerText());
    }

    public void answerButtonClicked(View v)
    {
        MultipleChoiceQuestion new_question = question_manager.getQuestionByIndex(current_question_number);

        new_question.getAnswerByIndex(0).setSelected(false);
        new_question.getAnswerByIndex(1).setSelected(false);
        new_question.getAnswerByIndex(2).setSelected(false);
        new_question.getAnswerByIndex(3).setSelected(false);
        new_question.getAnswerByIndex(4).setSelected(false);


        Button button;
        button = (Button)findViewById(R.id.choice1);
        button.setBackgroundColor(0xFF0091EA);

        button = (Button)findViewById(R.id.choice2);
        button.setBackgroundColor(0xFF0091EA);

        button = (Button)findViewById(R.id.choice3);
        button.setBackgroundColor(0xFF0091EA);

        button = (Button)findViewById(R.id.choice4);
        button.setBackgroundColor(0xFF0091EA);

        button = (Button)findViewById(R.id.choice5);
        button.setBackgroundColor(0xFF0091EA);

        switch (v.getId())
        {
            case R.id.choice1:
                button = (Button)findViewById(R.id.choice1);
                button.setBackgroundColor(Color.RED);
                new_question.getAnswerByIndex(0).setSelected(true);
                break;
            case R.id.choice2:
                button = (Button)findViewById(R.id.choice2);
                button.setBackgroundColor(Color.RED);
                new_question.getAnswerByIndex(1).setSelected(true);
                break;
            case R.id.choice3:
                button = (Button)findViewById(R.id.choice3);
                button.setBackgroundColor(Color.RED);
                new_question.getAnswerByIndex(2).setSelected(true);
                break;
            case R.id.choice4:
                button = (Button)findViewById(R.id.choice4);
                button.setBackgroundColor(Color.RED);
                new_question.getAnswerByIndex(3).setSelected(true);
                break;
            case R.id.choice5:
                button = (Button)findViewById(R.id.choice5);
                button.setBackgroundColor(Color.RED);
                new_question.getAnswerByIndex(4).setSelected(true);
                break;
            case next_question:
                goToNextQuestion();
            default:
                break;
        }
    }

    public void goToNextQuestion()
    {
        if (current_question.getNextQuestionIsTrueFalse())
        {
            Intent intent = new Intent(this, TrueFalseQuestionActivity.class);
//            intent.putExtra("active_question_number", next_question_number);
            intent.putExtra("question_manager", question_manager);

            startActivity(intent);
        }
        else
        {
            Button button;
            button = (Button) findViewById(R.id.choice1);
            button.setBackgroundColor(0xFF0091EA);

            button = (Button) findViewById(R.id.choice2);
            button.setBackgroundColor(0xFF0091EA);

            button = (Button) findViewById(R.id.choice3);
            button.setBackgroundColor(0xFF0091EA);

            button = (Button) findViewById(R.id.choice4);
            button.setBackgroundColor(0xFF0091EA);

            button = (Button) findViewById(R.id.choice5);
            button.setBackgroundColor(0xFF0091EA);

            TextView question_text = (TextView) findViewById(question);
            Button button1 = (Button) findViewById(R.id.choice1);
            Button button2 = (Button) findViewById(R.id.choice2);
            Button button3 = (Button) findViewById(R.id.choice3);
            Button button4 = (Button) findViewById(R.id.choice4);
            Button button5 = (Button) findViewById(R.id.choice5);

            current_question_number += 1;
            current_question = question_manager.getQuestionByIndex(current_question_number);

            question_text.setText(current_question.getQuestionText());
            button1.setText(current_question.getAnswerByIndex(0).getAnswerText());
            button2.setText(current_question.getAnswerByIndex(1).getAnswerText());
            button3.setText(current_question.getAnswerByIndex(2).getAnswerText());
            button4.setText(current_question.getAnswerByIndex(3).getAnswerText());
            button5.setText(current_question.getAnswerByIndex(4).getAnswerText());
        }
    }
}
