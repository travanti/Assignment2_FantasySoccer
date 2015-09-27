package com.scomps.www.assignment2_fantasysoccer;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.Hashtable;


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


        //@todo make keys players names
        SoccerPlayer rza = new SoccerPlayer("RZA", team1, OFFENSIVE, BESTEST); //create first player and add to ht
        ht.put("rza", rza);

        SoccerPlayer gza = new SoccerPlayer("GZA", team1, OFFENSIVE, BEST);
        ht.put("gza", gza);

        SoccerPlayer methodman = new SoccerPlayer("Method Man", team1, GOALIE, BEST);
        ht.put("Method_Man", methodman);

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
        textView1.setText(ht.get("rza").toString());

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
