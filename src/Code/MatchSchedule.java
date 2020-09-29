/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Code;
import java.util.ArrayList;
/**
 *
 * @author Ashish Kumar Singh
 */
public class MatchSchedule {
    private ArrayList<Match> matches = new ArrayList<>();
    private ArrayList<Team> allTeams;

    MatchSchedule() { }

    MatchSchedule(ArrayList<Team> allTeams) {
        this.allTeams = allTeams;
    }
    
    ArrayList<Match> getMatches() {
        return matches;
    }
    
    void addMatch(Match m) {
        matches.add(m);
    }
    
    void addMatch(Team team1, Team team2, int team1Points, int team2Points) {
        
        matches.add(new Match(team1, team2, team1Points, team2Points));
    }
}
