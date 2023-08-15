package com.example.tic_tac_toe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import java.util.Arrays;

public class PlayerSetup extends AppCompatActivity {
    private EditText Player1;
    private EditText Player2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player_setup);
        Player1= findViewById(R.id.editTextText);
        Player2= findViewById(R.id.editTextText2);


    }
    public void playersSubmit(View view)
    {
        String editTextText=Player1.getText().toString();
        String editTextText2=Player2.getText().toString();
        Intent intent= new Intent(this , GameDisplay.class);
        intent.putExtra("Players_Name", new String[] {editTextText,editTextText2});
        startActivity(intent);



    }
}