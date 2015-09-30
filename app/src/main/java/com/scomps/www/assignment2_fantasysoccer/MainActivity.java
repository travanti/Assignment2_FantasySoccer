package com.scomps.www.assignment2_fantasysoccer;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import java.util.Hashtable;


//DeathGripsImage by Omarurena1996 downloaded from https://en.wikipedia.org/wiki/Death_Grips#
///media/File:Death_Grips_at_Brooklyn_Masonic_Temple,_NYC_(2015).jpg

//cypresshillcrop.jpg by Philgarlic downloaded from https://en.wikipedia.org/wiki/Cypress_Hill#
// /media/File:Cypress_Hill_crop.jpg

//credit for Beastie Boys Image:
//"Beastie Boys Compo" by WikiLaurent - Composition based on File:Adam Horovitz.jpg,
// File:Adam Yauch 2.jpg and File:Michael Diamond 1.jpg. Licensed under CC BY-SA 3.0 via Commons -
// https://commons.wikimedia.org/wiki/File:Beastie_Boys_Compo.jpg#/media/File:Beastie_Boys_Compo.jpg


public class MainActivity extends ActionBarActivity {
    public static Hashtable ht = new Hashtable<String, SoccerPlayer>();
    public static final int OFFENSIVE = 1;
    public static final int DEFENSEIVE = 2;
    public static final int GOALIE = 3;
    public static final int BESTEST = 90;
    public static final int BEST = 70;
    public static final int GOOD = 60;
    public static final int OKAY = 50;
    public static final int AIGHT =30;
    public static final int BAD = 10;
    public static final String TEAM_1 = "Wu Tang Clan";
    public static final String TEAM_2 = "Death Grips";
    public static final String TEAM_3 = "Naughty by Nature";
    public static final String TEAM_4 = "Cypress Hill";
    public static String[] tOne;
    public static String[] tTwo;
    public static String[] tThree;
    public static String[] tFour;
    public static String IDENTITY = "id";


    @Override
    //@todo Make text display based off of information from hash table
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tOne = new String[4];
        tOne[0] = "rza";
        tOne[1] = "gza";
        tOne[2] = "methodman";
        tOne[3] = "raekwon";
        tTwo = new String[3];
        tTwo[0] = "mcride";
        tTwo[1] = "zachHill";
        tTwo[2] = "andyMorin";
        tThree = new String[3];
        tThree[0] = "treach";
        tThree[1] = "djKayGee";
        tThree[2] = "vinRock";
        tFour = new String[4];
        tFour[0] = "bReal";
        tFour[1] = "djMuggs";
        tFour[2] = "senDog";
        tFour[3] = "ericbobo";

        SoccerPlayer rza = new SoccerPlayer("RZA", TEAM_1, OFFENSIVE, BESTEST); //create first player and add to ht
        ht.put("rza", rza);

        SoccerPlayer gza = new SoccerPlayer("GZA", TEAM_1, OFFENSIVE, BEST);
        ht.put("gza", gza);

        SoccerPlayer methodman = new SoccerPlayer("Method Man", TEAM_1, GOALIE, BEST);
        ht.put("methodman", methodman);

        SoccerPlayer raekwon = new SoccerPlayer("Raekwon", TEAM_1, DEFENSEIVE, BEST);
        ht.put("raekwon", raekwon);

        SoccerPlayer mcride = new SoccerPlayer("MC RIDE", TEAM_2, OFFENSIVE, BESTEST);
        ht.put("mcride", mcride);

        SoccerPlayer zachHill = new SoccerPlayer("ZACH HILL", TEAM_2, DEFENSEIVE, BEST);
        ht.put("zachHill", zachHill);

        SoccerPlayer andyMorin = new SoccerPlayer("ANDY MORIN", TEAM_2, GOALIE, BEST);
        ht.put("andyMorin", andyMorin);

        SoccerPlayer treach = new SoccerPlayer("TREACH", TEAM_3, OFFENSIVE, GOOD);
        ht.put("treach", treach);

        SoccerPlayer djKayGee = new SoccerPlayer("DJ Kay Gee", TEAM_3, DEFENSEIVE, OKAY);
        ht.put("djKayGee", djKayGee);

        SoccerPlayer vinRock = new SoccerPlayer("Vin Rock", TEAM_3, GOALIE, GOOD);
        ht.put("vinRock", vinRock);

        SoccerPlayer bReal = new SoccerPlayer("B-Real", TEAM_4, OFFENSIVE, GOOD);
        ht.put("bReal", bReal);

        SoccerPlayer djMuggs = new SoccerPlayer("DJ Muggs", TEAM_4, DEFENSEIVE, GOOD);
        ht.put("djMuggs", djMuggs);

        SoccerPlayer senDog = new SoccerPlayer("Sen Dog", TEAM_4, GOALIE, GOOD);
        ht.put("senDog", senDog);

        SoccerPlayer ericBobo = new SoccerPlayer("Eric Bobo", TEAM_4, OFFENSIVE, GOOD);
        ht.put("ericbobo", ericBobo);


        final TextView textView1 = (TextView) findViewById(R.id.TeamOneDescript);
        textView1.setText(ht.get(tOne[0]).toString() + String.format("%n") +
                ht.get(tOne[1]).toString() + String.format("%n") +
                ht.get(tOne[2]).toString() + String.format("%n") +
                ht.get(tOne[3]).toString());
        final TextView textView2 = (TextView) findViewById(R.id.TeamTwoDescript);
        textView2.setText(ht.get(tTwo[0]).toString()+String.format("%n")+
                          ht.get(tTwo[1]).toString()+String.format("%n")+
                          ht.get(tTwo[2]).toString());
        final TextView textView3 = (TextView) findViewById(R.id.teamThreeDescript);
        textView3.setText(ht.get(tThree[0]).toString() + String.format("%n") +
                          ht.get(tThree[1]).toString() + String.format("%n")+
                          ht.get(tThree[2]).toString());
        final TextView textView4 = (TextView) findViewById(R.id.teamFourDescript);
        textView4.setText(ht.get(tFour[0]).toString() + String.format("%n") +
                          ht.get(tFour[1]).toString() + String.format("%n") +
                          ht.get(tFour[2]).toString() + String.format("%n") +
                          ht.get(tFour[3].toString()));


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void editTeamsActivityTeam1(View view) {
        Intent startEditTeamActivity = new Intent(this, TeamEditTeam1.class);
        startEditTeamActivity.putExtra(TEAM_1, tOne);
        int id = 4;
        startEditTeamActivity.putExtra(IDENTITY, id);

        startActivity(startEditTeamActivity);
    }



    public void editTeamsActivityTeam3(View view) {
        Intent startEditTeamActivity = new Intent(this, TeamEditTeam1.class);
        startEditTeamActivity.putExtra(TEAM_1, tThree);
        int id = 3;
        startEditTeamActivity.putExtra(IDENTITY, id);

        startActivity(startEditTeamActivity);
    }

    public void editTeamsActivityTeam4(View view) {
        Intent startEditTeamActivity = new Intent(this, TeamEditTeam1.class);
        startEditTeamActivity.putExtra(TEAM_1, tFour);
        int id = 4;
        startEditTeamActivity.putExtra(IDENTITY, id);

        startActivity(startEditTeamActivity);
    }

    public void editTeamsActivityTeam2(View view) {

        Intent startEditTeamActivity = new Intent(this, TeamEditTeam1.class);
        startEditTeamActivity.putExtra(TEAM_1, tTwo);

        int id = 3;
        startEditTeamActivity.putExtra(IDENTITY, id);

        startActivity(startEditTeamActivity);

    }
}
