package com.scomps.www.assignment2_fantasysoccer;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class TeamEditTeam1 extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String[] team = getIntent().getStringArrayExtra(MainActivity.TEAM_1);

        setContentView(R.layout.team_edit_team1);
        TextView descript = (TextView) findViewById(R.id.playerOneDescript);
        TextView descript2 = (TextView) findViewById(R.id.playerTwoDescript);
        TextView descript3 = (TextView) findViewById(R.id.playerThreeDescript);
        String identity = MainActivity.IDENTITY;

        int j = 0;
        j = getIntent().getIntExtra(MainActivity.IDENTITY, j);

        if(j > 3) {
            TextView descript4 = (TextView) findViewById(R.id.playerFourDescript);
            descript4.setText(MainActivity.ht.get(team[3]).toString() + ".");
        }



        descript.setText(MainActivity.ht.get(team[0]).toString()+".");
        descript2.setText(MainActivity.ht.get(team[1]).toString()+"."); //do convoluted bullsh!t to get my sh!t
        descript3.setText(MainActivity.ht.get(team[2]).toString()+".");
//        final TextView textView1 = (TextView) findViewById(R.id.TeamOneDescript);
//        textView1.setText(ht.get(tOne[0]).toString() + String.format("%n") +
//                ht.get(tOne[1]).toString() + String.format("%n") +
//                ht.get(tOne[2]).toString() + String.format("%n") +
//                ht.get(tOne[3]).toString());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_team_edit, menu);
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
