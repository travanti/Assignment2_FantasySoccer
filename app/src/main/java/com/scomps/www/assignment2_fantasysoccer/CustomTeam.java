package com.scomps.www.assignment2_fantasysoccer;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;


public class CustomTeam extends ActionBarActivity {
    public static boolean call[];
    public static boolean called = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_team);
        call = getIntent().getBooleanArrayExtra(MainActivity.TEAM_1);
        called = call[0];

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_custom_team, menu);
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

    public void regNewTeam(View view) {
        String p1Name = null;
        String p2Name = null;
        String p3Name = null;
        String p4Name = null;
        String teamName = null;
        int pP1 = 0;
        int pP2 = 0;
        int pP3 = 0;
        int pP4 = 0;
        EditText n1 = (EditText) findViewById(R.id.playerOneEntry); //listeners for names
        EditText n2 = (EditText) findViewById(R.id.playerTwoEntry);
        EditText n3 = (EditText) findViewById(R.id.playerThreeEntry);
        EditText n4 = (EditText) findViewById(R.id.playerFourEntry);
        EditText p1 = (EditText) findViewById(R.id.playerOneEntryPower); //listeners for power
        EditText p2 = (EditText) findViewById(R.id.playerTwoEntryPower);
        EditText p3 = (EditText) findViewById(R.id.playerThreeEntryPower);
        EditText p4 = (EditText) findViewById(R.id.playerFourEntryPower);

        pP1 = Integer.parseInt(p1.getText().toString()); //force it to behave, assuming int is placed
        pP2 = Integer.parseInt(p2.getText().toString()); //force it to behave, assuming int is placed
        pP3 = Integer.parseInt(p3.getText().toString()); //force it to behave, assuming int is placed
        pP4 = Integer.parseInt(p4.getText().toString()); //powers are here
        p1Name = p1.getText().toString(); //names are here
        p2Name = p2.getText().toString();
        p3Name = p3.getText().toString();
        p4Name = p4.getText().toString();
        EditText team = (EditText) findViewById(R.id.teamNameEntry);
        teamName = team.getText().toString();

        SoccerPlayer mp1 = new SoccerPlayer(p1Name, teamName, MainActivity.OFFENSIVE, pP1);
        SoccerPlayer mp2 = new SoccerPlayer(p2Name, teamName, MainActivity.OFFENSIVE, pP2);
        SoccerPlayer mp3 = new SoccerPlayer(p3Name, teamName, MainActivity.DEFENSEIVE, pP3);
        SoccerPlayer mp4 = new SoccerPlayer(p4Name, teamName, MainActivity.GOALIE, pP4);
        if(called) {

            MainActivity.ht.put("mp1", mp1);
            MainActivity.ht.put("mp2", mp2);
            MainActivity.ht.put("mp3", mp3);
            MainActivity.ht.put("mp4", mp4);
            MainActivity.wasCalled = true;
        }
        else
        {
            MainActivity.ht.put("mp1a", mp1);
            MainActivity.ht.put("mp2a", mp2);
            MainActivity.ht.put("mp3a", mp3);
            MainActivity.ht.put("mp4a", mp4);
        }

    }
}
