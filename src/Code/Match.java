/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Code;

/**
 *
 * @author Nikhil Rana
 */
public class Match {
    private Team team1;
    private Team team2;
    private int team1Points;
    private int team2Points;

    Match(Team team1, Team team2, int team1Points, int team2Points) {  
        this.team1 = team1;
        this.team2 = team2;
        this.team1Points = team1Points;
        this.team2Points = team2Points;
        int diff = team1Points-team2Points;
        if(diff>0) {
            this.team1.updatePoints(2);
            this.team2.updatePoints(0);
        } else if(diff==0) { 
            this.team2.updatePoints(1);
            this.team1.updatePoints(1);
        } else { 
            this.team2.updatePoints(2);
            this.team1.updatePoints(0);
        }  
    }

}
