package com.example.chova.problemsortingapp;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;

public class AssessDim1Activity extends AppCompatActivity {

    private LinearLayout[] lignes;
    private TextView[] labelProblemes;
    private LinearLayout[] couples;
    private SeekBar[] defileurs;
    private TextView[] afficheurs;

    private LinearLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        //setContentView( R.layout.activity_assess_dim1 );

         setContentView(R.layout.activity_assess_dim1);
         this.layout=findViewById(R.id.linearLayout);
         this.layout.setPadding(15,60,15,10);

         this.lignes = new LinearLayout[10];
         this.labelProblemes= new TextView[10];
         this.defileurs = new SeekBar[10];
         this.afficheurs = new TextView[10];
         this.couples = new LinearLayout[10];

        //fonction pour obtenir le nombre de problème
        //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

        /*for (int i=0 ; i< this.defileurs.length; ++i){*/

        for (int i =0 ; i < 10 ;i++){

            //INITIALISATION DE LA LIGNE
            this.lignes[i] = new LinearLayout(this);
            this.lignes[i].setOrientation(LinearLayout.VERTICAL);/*
            this.lignes[i].setHorizontalGravity(Gravity.CENTER);*/
            this.lignes[i].setPadding(0,30,0,30);

            //INITIALISATION DU LABEL PROBLEME
            int j=i+1;
            String s = "probleme n°" + j;
            this.labelProblemes[i]= new TextView(this);
            this.labelProblemes[i].setText(s);
            this.labelProblemes[i].setGravity(Gravity.CENTER);

            //INITIALISATION DU COUPLE AFFICHEUR/DEFILEUR
            this.couples[i]=new LinearLayout(this);
            this.couples[i].setOrientation(LinearLayout.HORIZONTAL);
            this.couples[i].setMinimumWidth(80);

            //INITIALISATION DU LABEL
            this.afficheurs[i]= new TextView(this);
            this.afficheurs[i].setText( "5" );
            this.afficheurs[i].setLayoutParams(new LinearLayout.LayoutParams(100,40));
            this.afficheurs[i].setMinHeight(50);

            //INITIALISATION DU DEFILEUR
            this.defileurs[i] = new SeekBar(this);
            this.defileurs[i].setMin( 0 );
            this.defileurs[i].setMax( 10 );
            this.defileurs[i].setMinimumWidth(70);
            this.defileurs[i].setProgress(5);
            this.defileurs[i].setLayoutParams(new LinearLayout.LayoutParams(900,LinearLayout.LayoutParams.WRAP_CONTENT));

            this.defileurs[i].setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
                @Override
                public void onProgressChanged(SeekBar seekBar, int valeur, boolean b) {

                    AssessDim1Activity.this.actualisationAfficheurs();
                }

                @Override
                public void onStartTrackingTouch(SeekBar seekBar) {

                }

                @Override
                public void onStopTrackingTouch(SeekBar seekBar) {

                }
            });


            //MISE EN PAGE

            this.layout.addView(this.lignes[i]);
            this.lignes[i].addView(this.labelProblemes[i]);
            this.lignes[i].addView(this.couples[i]);
            this.couples[i].addView(this.defileurs[i]);
            this.couples[i].addView( this.afficheurs[i] );
            //this.defileurs[i].setLayoutParams( ViewGroup. );



        }
    }

   public void actualisationAfficheurs(){
        for (int i=0; i<this.defileurs.length;  i++){
            String string = Integer.toString(this.defileurs[i].getProgress());
            this.afficheurs[i].setText(string);
        }
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
                Intent intent2 = new Intent(this, ProblemInput.class);
                this.startActivity(intent2);
                break;
            default:
                return super.onOptionsItemSelected(item);
        }

    /*    int id = item.getItemId();

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
                    Intent otherActivity = new Intent(getApplicationContext(), ProblemInput.class );
                    startActivity(otherActivity);
                    finish();
                }
            });

            return true;
        }*/


        return super.onOptionsItemSelected(item);
    }

}
