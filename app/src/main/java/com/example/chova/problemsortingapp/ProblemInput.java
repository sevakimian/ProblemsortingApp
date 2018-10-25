package com.example.chova.problemsortingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
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
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {


        switch(item.getItemId()) {
            case R.id.retourAccueil:
                Intent intent = new Intent(this, MainActivity.class);
                this.startActivity(intent);
                break;
            case R.id.retour:
                Intent intent2 = new Intent(this, newProblemActivity.class);
                this.startActivity(intent2);
                break;
            default:
                return super.onOptionsItemSelected(item);
        }


        /*int id = item.getItemId();

        if (id == R.id.retourAccueil) {
            Button btnRetourAccueil = (Button) findViewById(R.id.retourAccueil);
            btnRetourAccueil.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent otherActivity = new Intent(getApplicationContext(), MainActivity.class );
                    startActivity(otherActivity);
                    finish();
                }
            });

            return true;
        }
        if (id == R.id.retour) {
            Button btnRetour = (Button) findViewById(R.id.retour);
            btnRetour.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent otherActivity = new Intent(getApplicationContext(), newProblemActivity.class );
                    startActivity(otherActivity);
                    finish();
                }
            });

            return true;
        }*/


        return super.onOptionsItemSelected(item);
    }
}
