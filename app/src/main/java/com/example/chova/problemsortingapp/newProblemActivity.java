package com.example.chova.problemsortingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
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
                Intent intent2 = new Intent(this, MainActivity.class);
                this.startActivity(intent2);
                break;
            default:
                return super.onOptionsItemSelected(item);
        }

        /*
        int id = item.getItemId();

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
                    Intent otherActivity = new Intent(getApplicationContext(), MainActivity.class );
                    startActivity(otherActivity);
                    finish();
                }
            });

            return true;
        }
*/

        return super.onOptionsItemSelected(item);
    }




}
