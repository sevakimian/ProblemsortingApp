package com.example.chova.problemsortingapp;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

        private Button btnNew;
        private Button btnEdit;
        private Button btnTuto;
        private Button btnParam;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.btnNew = (Button) findViewById(R.id.btnNewProblem);

        btnNew.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent otherActivity = new Intent(getApplicationContext(), newProblemActivity.class );
                startActivity(otherActivity);
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






        /* int id = item.getItemId();*/

       /* if (id == R.id.retourAccueil) {
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
        }*/


        return super.onOptionsItemSelected(item);
    }

}
