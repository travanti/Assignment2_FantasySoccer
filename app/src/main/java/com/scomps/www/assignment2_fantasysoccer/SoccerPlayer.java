package com.scomps.www.assignment2_fantasysoccer;

/**
 * Created by travanti16 on 9/25/2015.
 */
public class SoccerPlayer {
    String name;
    String team;
    int position;
    int power;


    public SoccerPlayer(String n, String t, int p, int pow)
    {
        if(n==null) //check null cases, should not occur
        {
            name = "duh";
        }
        else{
            name = n;
        }
        if(t == null){ //check null cases, should not occur
            team = "duh";
        }
        else{
            team = t;
        }
        if(p == 0 || p>3){ //abritarially make team position goalie if weird value is passed in
            position = 3;
        }
        else {
            position = p;
        }
        if(pow < 0 || pow>100)
        {
            power = 0; //if out of range this player is just bad.
        }
        else
        {
            power = pow;
        }

    }

    public String getPosition(){
        String pos;
        if(this.position == 1){
            return "offense"; //hot shot
        }
        else if(this.position ==2){
            return "defesne"; //chillin
        }
        else if(this.position ==3){
            return "goalie"; //really chillin
        }
        else {
            return "ERROR!"; //should NEVER occur
        }
    }
    public String getName(){
        return this.name;
    }

    public String getTeam(){
        return this.team;
    }

//    public String getPower(){
//        String result = String.valueOf(this.power);
//        return result;
//    }


    public int getPower(){
        return this.power;

    }

    public String toString(){
        String pos;
        if(this.position == 1){
            pos= "offense"; //hot shot
        }
        else if(this.position ==2){
            pos="defesne"; //chillin
        }
        else if(this.position ==3){
            pos="goalie"; //really chillin
        }
        else
        {
            pos="ERROR!"; //should NEVER occur
        }

        String result = "Name: " + this.name + ", Team: " + this.team + ", Position: "
                        + pos + ", Power: " + this.power;
        return result;
    }
}
