package com.example.chova.problemsortingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ProblemInput extends AppCompatActivity {

        private TextView txt_pblmInput;
        private EditText txtInput1;
        private Button buttonOK;
        private Button btnSuivant;
        private LinearLayout layoutProb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_problem_input );

        this.txt_pblmInput= findViewById( R.id.txt_pblmInput );


        this.txtInput1=findViewById( R.id.txtInput1 );
        this.buttonOK = findViewById( R.id.buttonOK );
        this.btnSuivant =findViewById( R.id.btnSuivant );
        this.layoutProb =findViewById(R.id.layoutProb);

        buttonOK.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {



            String pb = txtInput1.getText().toString();
            txt_pblmInput.append(pb + "\r\n");
            txtInput1.setText( "" );
            }
        } );

        this.btnSuivant.setOnClickListener( new View.OnClickListener(){

            @Override
            public void onClick(View view){
                Intent otherActivity = new Intent(getApplicationContext(), AssessDim1Activity.class);

                startActivity( otherActivity );
                finish();
            }
        } );


    }
}
