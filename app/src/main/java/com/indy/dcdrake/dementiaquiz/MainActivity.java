package com.indy.dcdrake.dementiaquiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private QuestionManager question_manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        question_manager = new QuestionManager();

    }

    public void onBeginClicked(View v) {
        if(v.getId() == R.id.start_button)
        {
            int next_question_number = 0;

            Intent intent = new Intent(this, MultipleChoiceQuestionActivity.class);
            intent.putExtra("active_question_number", next_question_number);
            intent.putExtra("question_manager", question_manager);

            startActivity(intent);
        }
    }
}
