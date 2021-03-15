package com.example.my_game;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {
Button buttton;
 EditText player1Name,player2Name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main3 );
        player1Name=(EditText)findViewById( R.id.player1Name );
        player2Name=(EditText)findViewById( R.id.player2Name );


    }


    public void submitBTNClick(View view){

    }public  void  submitbtn(View view) {

        Intent intent = new Intent( Main3Activity.this, Main6Activity.class );
        startActivity( intent );}}






