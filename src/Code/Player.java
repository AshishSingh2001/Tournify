/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Code;

/**
 * Player Object
 * <p>
 * 
 * Parameters:
 * <ul>
 *  <li> String <b> name </b> 
 *  <li> String <b> height </b> 
 *  <li> String <b> experience </b> Some info about player with experience
 *  <li> String <b> position </b> Place where player play(attacker or defender etc)
 *  <li> String <b> team </b> Team name 
 *  <li> int <b> matchPlayed </b> Number of matches played
 *  <li> int <b> year </b> In which year player started playing
 *  <li> int <b> leaguePlayed </b> Number of seasons he played in league
 *  <li> int <b> team_id </b> Unique ID given to every team
 * </ul>
 * <p>
 * 
 * @author Ashish Kumar Singh
 * 
 */

public class Player implements java.io.Serializable
{

    private String name;
    private String height;
    private String experience;
    private String position;
    private String teamName;
    private int matchPlayed;
    private int year;
    private int leaguePlayed;
    private int team_id;

    public Player(String name, String height, String experience, String position, int matchPlayed,
     int year,int leaguePlayed,String teamName ,int team_id) {
        this.name = name;
        this.height = height;
        this.experience = experience;
        this.position = position;
        this.matchPlayed = matchPlayed;
        this.year = year;
        this.leaguePlayed = leaguePlayed;
        this.teamName =teamName ;
        this.team_id=team_id;
    }

    public final String getName() {
        return name;
    }

    public final String getHeight() {
        return height;
    }

    public final String getExperience() {
        return experience;
    }

    public final String getPosition() {
        return position;
    }

    public final int getMatchPlayed() {
        return matchPlayed;
    }

    public final int getYear() {
        return year;
    }

    public final int getleaguePlayed() {
        return leaguePlayed;
    }

    public final String getTeamName(){
        return teamName ;
    }

    public final int getTeamId(){
        return team_id;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setMatchPlayed(int matchPlayed) {
        this.matchPlayed = matchPlayed;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLeaguePlayed(int leaguePlayed) {
        this.leaguePlayed = leaguePlayed;
    }

    public void setTeamName(String teamName){
        this.teamName =teamName ;
    }

    public void setTeamId(int team_id){
        this.team_id=team_id;
    }

    @Override
    public String toString() {
        return (name + " " + matchPlayed + " " + teamName);
    }

    public static void main(String[] args) {
        System.out.println("Player Test ");
        
        Player p = new Player("name", "height", "experience", "position", 1, 1, 1, "tean", 1);

        System.out.println(p);
        
    }
}