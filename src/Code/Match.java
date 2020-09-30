/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Code;

import java.beans.PropertyChangeSupport;
import java.beans.VetoableChangeSupport;

/**
 *
 * @author Nikhil Rana
 */
public class Match {
    private Team team1;
    private Team team2;
    private int team1Points;
    private int team2Points;
    private int diff;
    Match(Team team1, Team team2, int team1Points, int team2Points) {  
        this.team1 = team1;
        this.team2 = team2;
        this.team1Points = team1Points;
        this.team2Points = team2Points;
         diff = team1Points-team2Points;
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
    public final int getDiff()
    {
        return diff;
    }

    /**
     * @return the team1
     */
    public final Team getTeam1() {
        return team1;
    }

    /**
     * @return the team2
     */
    public final Team getTeam2() {
        return team2;
    }

    /**
     * @return the team1Points
     */
    public final int getTeam1Points() {
        return team1Points;
    }

    /**
     * @return the team2Points
     */
    public final int getTeam2Points() {
        return team2Points;
    }
    private final transient PropertyChangeSupport propertyChangeSupport = new java.beans.PropertyChangeSupport(this);
    private final transient VetoableChangeSupport vetoableChangeSupport = new java.beans.VetoableChangeSupport(this);
    public static final String PROP_TEAM1 = "team1";
    public static final String PROP_TEAM2 = "team2";
    public static final String PROP_TEAM1POINTS = "team1Points";
    public static final String PROP_TEAM2POINTS = "team2Points";
    public static final String PROP_DIFF = "diff";

}
