package com.scomps.www.assignment2_fantasysoccer;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.Hashtable;


//DeathGripsImage by Omarurena1996 downloaded from https://en.wikipedia.org/wiki/Death_Grips#
///media/File:Death_Grips_at_Brooklyn_Masonic_Temple,_NYC_(2015).jpg


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


    @Override
    //@todo Make hashtable set up properly with new soccerplayer object w/ unitque keys
    //@todo Make text display based off of information from hash table
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String team1 = "Wu Tang Clan";
        String team2 = "Death Grips";
        String team3 = "Naughty by Nature";
        String team4 = "Cypress Hill";
        String team5 = "Beastie Boys";
        String[] tOne = new String[4];
        tOne[0] = "rza";
        tOne[1] = "gza";
        tOne[2] = "methodman";
        tOne[3] = "raekwon";
        String[] tTwo = new String[3];
        tTwo[0] = "mcride";
        tTwo[1] = "zachHill";
        tTwo[2] = "andyMorin";
        String[] tThree = new String[3];
        tThree[0] = "treach";
        tThree[1] = "djKayGee";
        tThree[2] = "vinRock";
        String[] tFour = new String[4];
        tFour[0] = "bReal";
        tFour[1] = "djMuggs";
        tFour[2] = "senDog";
        tFour[3] = "ericbobo";
        String[] tFive = new String[3];
        tFive[0] = "adRock";
        tFive[1] = "mikeD";
        tFive[2] = "mca";

        //@todo make keys players names
        SoccerPlayer rza = new SoccerPlayer("RZA", team1, OFFENSIVE, BESTEST); //create first player and add to ht
        ht.put("rza", rza);

        SoccerPlayer gza = new SoccerPlayer("GZA", team1, OFFENSIVE, BEST);
        ht.put("gza", gza);

        SoccerPlayer methodman = new SoccerPlayer("Method Man", team1, GOALIE, BEST);
        ht.put("methodman", methodman);

        SoccerPlayer raekwon = new SoccerPlayer("Raekwon", team1, DEFENSEIVE, BEST);
        ht.put("raekwon", raekwon);

        SoccerPlayer mcride = new SoccerPlayer("MC RIDE", team2, OFFENSIVE, BESTEST);
        ht.put("mcride", mcride);

        SoccerPlayer zachHill = new SoccerPlayer("ZACH HILL", team2, DEFENSEIVE, BEST);
        ht.put("zachHill", zachHill);

        SoccerPlayer andyMorin = new SoccerPlayer("ANDY MORIN", team2, GOALIE, BEST);
        ht.put("andyMorin", andyMorin);

        SoccerPlayer treach = new SoccerPlayer("TREACH", team3, OFFENSIVE, GOOD);
        ht.put("treach", treach);

        SoccerPlayer djKayGee = new SoccerPlayer("DJ Kay Gee", team3, DEFENSEIVE, OKAY);
        ht.put("djKayGee", djKayGee);

        SoccerPlayer vinRock = new SoccerPlayer("Vin Rock", team3, GOALIE, GOOD);
        ht.put("vinRock", vinRock);

        SoccerPlayer bReal = new SoccerPlayer("B-Real", team4, OFFENSIVE, GOOD);
        ht.put("bReal", bReal);

        SoccerPlayer djMuggs = new SoccerPlayer("DJ Muggs", team4, DEFENSEIVE, GOOD);
        ht.put("djMuggs", djMuggs);

        SoccerPlayer senDog = new SoccerPlayer("Sen Dog", team4, GOALIE, GOOD);
        ht.put("senDog", senDog);

        SoccerPlayer ericBobo = new SoccerPlayer("Eric Bobo", team4, OFFENSIVE, GOOD);
        ht.put("ericbobo", ericBobo);

        SoccerPlayer adRock = new SoccerPlayer("Ad-Rock", team5, OFFENSIVE, OKAY);
        ht.put("adRock", adRock);

        SoccerPlayer mikeD = new SoccerPlayer("Mike D", team5, DEFENSEIVE, OKAY);
        ht.put("mikeD", andyMorin);

        SoccerPlayer mca = new SoccerPlayer("MCA", team5, GOALIE, OKAY);
        ht.put("mca", mca);

        final TextView textView1 = (TextView) findViewById(R.id.TeamOneDescript);
        textView1.setText(ht.get(tOne[0]).toString()+String.format("%n")+
                          ht.get(tOne[1]).toString()+String.format("%n")+
                          ht.get(tOne[2]).toString()+String.format("%n")+
                          ht.get(tOne[3]).toString());

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
}
