package com.example.chova.problemsortingapp;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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

}
