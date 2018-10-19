package com.example.chova.problemsortingapp;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;

public class AssessDim1Activity extends AppCompatActivity {

    private SeekBar[] defileurs;
    private TextView[] afficheurs;
    private LinearLayout[] lignes;
    private LinearLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        //setContentView( R.layout.activity_assess_dim1 );

         setContentView(R.layout.activity_assess_dim1);
         this.layout=findViewById(R.id.linearLayout);
         this.layout.setPadding(15,60,15,10);

         this.defileurs = new SeekBar[10];
         this.afficheurs = new TextView[10];
         this.lignes = new LinearLayout[10];

        //fonction pour obtenir le nombre de problème
        //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

        /*for (int i=0 ; i< this.defileurs.length; ++i){*/

        for (int i =0 ; i < 10 ;i++){

            this.lignes[i]=new LinearLayout(this);
            this.layout.addView(this.lignes[i]);

            this.lignes[i].setOrientation(LinearLayout.HORIZONTAL);
            this.lignes[i].setMinimumWidth(80);

            //initialisation du défileur

            this.defileurs[i] = new SeekBar(this);
            this.lignes[i].addView(this.defileurs[i]);
            this.defileurs[i].setMin( 0 );
            this.defileurs[i].setMax( 10 );
            this.defileurs[i].setMinimumWidth(70);
            //this.defileurs[i].setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.MATCH_PARENT));


            //initialisation du label
            this.afficheurs[i]= new TextView(this);
            this.lignes[i].addView( this.afficheurs[i] );
            this.afficheurs[i].setText( "5" );
            this.afficheurs[i].setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.MATCH_PARENT));
            this.afficheurs[i].setMinHeight(50);

            //this.defileurs[i].setLayoutParams( ViewGroup. );



        }
    }
}
