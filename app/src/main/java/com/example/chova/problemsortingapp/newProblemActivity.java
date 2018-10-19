package com.example.chova.problemsortingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class newProblemActivity extends AppCompatActivity {

    private TextView nameInput;
    private TextView dim1Input;
    private TextView dim2Input;
    private TextView dim3Input;
    private Button okButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_problem);




        okButton = findViewById(R.id.btn_nvProjet_ok);
        okButton.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               Intent otherActivity = new Intent(getApplicationContext(), ProblemInput.class);

               startActivity( otherActivity );
               finish();
            }
        } );


    }





}
