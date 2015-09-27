package com.scomps.www.assignment2_fantasysoccer;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.Hashtable;


public class MainActivity extends ActionBarActivity {
    public static Hashtable ht = new Hashtable<String, String>();
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
        String Team1 = "Wu Tang Clan";
        String Team2 = "Death Grips";
        String Team3 = "Naughty by Nature";
        String Team4 = "Cypress Hill";
        String Team5 = "Beastie Boys";
        String Team6 = "NWA";

        SoccerPlayer RZA = new SoccerPlayer("RZA", Team1, OFFENSIVE, 80); //create first player and add to ht
        ht.put(RZA.toString(), RZA);

        SoccerPlayer GZA = new SoccerPlayer("GZA", Team1, OFFENSIVE, 70);
        ht.put(GZA.toString(), GZA);

        SoccerPlayer MethodMan = new SoccerPlayer("Method Man", Team1, GOALIE, 80);
        ht.put(Team1, "Method Man");
        ht.put(Team1, "Raekwon");
        ht.put(Team2, "MC RIDE");
        ht.put(Team2, "ZACH HILL");
        ht.put(Team2, "Andy Morin");
        ht.put(Team3, "Treach");
        ht.put(Team3, "DJ Kay Gee");
        ht.put(Team3, "Vin Rock");
        ht.put(Team4, "B-Real");
        ht.put(Team4, "DJ Muggs");
        ht.put(Team4, "Sen Dog");
        ht.put(Team4, "Eric Bobo");
        ht.put(Team5, "Ad-Rock");
        ht.put(Team5, "Mike D");
        ht.put(Team5, "MCA");
        ht.put(Team6, "Eazy-E");
        ht.put(Team6, "Dr. Dre");
        ht.put(Team6, "Ice Cube");
        ht.put(Team6, "MC Ren");

        final TextView textView1 = (TextView) findViewById(R.id.TeamOneDescript);
//        textView1.setText();

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
