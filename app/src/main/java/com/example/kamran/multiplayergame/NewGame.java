package com.example.kamran.multiplayergame;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import static android.R.id.message;

public class NewGame extends AppCompatActivity {
// String cdk= "com.example.kamran.multiplayergame"

    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_game);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
      //  String message = intent.getExtras();
       tv= (TextView) findViewById(R.id.NewGameId);

       // Bundle b=intent.getExtras();
      //  String ib= (String)b.get("name");
      // tv.setText(ib);
//Random Number is generated on main activity then pass it to new game
        String Getval = intent.getStringExtra("Name");
        tv.setText(Getval);
     Toast.makeText(getApplicationContext(), Getval, Toast.LENGTH_SHORT).show();

    }//end of on create

}
