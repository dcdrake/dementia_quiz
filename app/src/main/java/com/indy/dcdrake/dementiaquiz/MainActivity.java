package com.indy.dcdrake.dementiaquiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onBeginClicked(View v){
        if(v.getId() == R.id.start_button)
        {
            int next_question_number = 0;

            Intent intent = new Intent(this, MultipleChoiceQuestionActivity.class);
            intent.putExtra("active_question_number", next_question_number);
            startActivity(intent);
        }
    }
}
