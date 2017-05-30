package com.example.android.scorekeeper2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA;
    int foulsTeamA;
    int scoreTeamB;
    int foulsTeamB;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public int getScoreTeamA() {
        return scoreTeamA;
    }

    public void setScoreTeamA(int scoreTeamA) {
        this.scoreTeamA = scoreTeamA;
    }

    public int getFoulsTeamA() {
        return foulsTeamA;
    }

    public void setFoulsTeamA(int foulsTeamA) {
        this.foulsTeamA = foulsTeamA;
    }

    public int getScoreTeamB() {
        return scoreTeamB;
    }

    public void setScoreTeamB(int scoreTeamB) {
        this.scoreTeamB = scoreTeamB;
    }

    public int getFoulsTeamB() {
        return foulsTeamB;
    }

    public void setFoulsTeamB(int foulsTeamB) {
        this.foulsTeamB = foulsTeamB;
    }



    public void scoreTeamA(){
        setScoreTeamA(getScoreTeamA()+1);
        displayScoreTeamA(getScoreTeamA());
    }

    public void foulTeamA(){
        setFoulsTeamA(getFoulsTeamA()+1);
        displayFoulsTeamA(getFoulsTeamA());
    }

    public void scoreTeamB(){
        setScoreTeamA(getScoreTeamB()+1);
        displayScoreTeamA(getScoreTeamB());
    }

    public void foulTeamB(){
        setFoulsTeamA(getFoulsTeamB()+1);
        displayFoulsTeamA(getFoulsTeamB());
    }

    public void reset(){
        setFoulsTeamA(0);
        setScoreTeamA(0);
        setFoulsTeamB(0);
        setScoreTeamB(0);
    }

    /*
    * Displays score of team A
    **/
    public void displayScoreTeamA (int score){
        TextView scoreView = (TextView) findViewById(R.id.scoreA);
        scoreView.setText(String.valueOf(score));
    }

    /*
    * Displays score of team B
    **/
    public void displayScoreTeamB (int score){
        TextView scoreView = (TextView) findViewById(R.id.scoreB);
        scoreView.setText(String.valueOf(score));
    }

    /*
   * Displays fouls of team A
   **/
    public void displayFoulsTeamA (int fouls){
        TextView foulsView = (TextView) findViewById(R.id.foulsValueA);
        foulsView.setText(String.valueOf(fouls));
    }

    /*
   * Displays fouls of team B
   **/
    public void displayFoulsTeamB (int fouls){
        TextView foulsView = (TextView) findViewById(R.id.foulsValueB);
        foulsView.setText(String.valueOf(fouls));
    }

}
