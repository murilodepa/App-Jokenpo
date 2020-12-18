package com.example.jokemp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void rockSelected(View view){
        this.optionSelected("rock");
        ImageView imageRock = findViewById(R.id.imageRock);
        ImageView imagePaper = findViewById(R.id.imagePaper);
        ImageView imageScissor = findViewById(R.id.imageScissor);

        imageRock.setImageResource(R.drawable.rockred);
        imagePaper.setImageResource(R.drawable.paper);
        imageScissor.setImageResource(R.drawable.scissor);
    }

    public void paperSelected(View view){
        this.optionSelected("paper");
        ImageView imageRock = findViewById(R.id.imageRock);
        ImageView imagePaper = findViewById(R.id.imagePaper);
        ImageView imageScissor = findViewById(R.id.imageScissor);

        imageRock.setImageResource(R.drawable.rock);
        imagePaper.setImageResource(R.drawable.paperred);
        imageScissor.setImageResource(R.drawable.scissor);
    }

    public void scissorSelected(View view){
        this.optionSelected("scissor");
        ImageView imageRock = findViewById(R.id.imageRock);
        ImageView imagePaper = findViewById(R.id.imagePaper);
        ImageView imageScissor = findViewById(R.id.imageScissor);

        imageRock.setImageResource(R.drawable.rock);
        imagePaper.setImageResource(R.drawable.paper);
        imageScissor.setImageResource(R.drawable.scissorred);
    }

    public void optionSelected(String userChoice){

        ImageView resultImage = findViewById(R.id.resultImage);
        TextView resultTextView = findViewById(R.id.resultTextView);

        String[] options = {"rock", "paper", "scissor"};
        int number = new Random().nextInt(3);
        String appChoice = options[number];

        switch ( appChoice ){
            case "rock" :
                resultImage.setImageResource(R.drawable.rock);
                break;
            case "paper":
                resultImage.setImageResource(R.drawable.paper);
                break;
            case "scissor" :
                resultImage.setImageResource(R.drawable.scissor);
                break;
        }

        if (
                ( appChoice == "rock" && userChoice == "scissor" ) ||
                (appChoice == "paper" && userChoice == "rock" ) ||
                (appChoice == "scissor" && userChoice == "paper" )
        ){/* App Wins */
            resultTextView.setText("YOU LOST :( ");
        }else if (
                (userChoice=="rock" && appChoice=="scissor") ||
                (userChoice=="paper" && appChoice=="rock") ||
                (userChoice=="scissor" && appChoice=="paper")
        ){/* User Wins */
            resultTextView.setText("YOU WON :) ");
        }else {/* A Draw */
            resultTextView.setText("WE DREW ;) ");
        }
    }
}
