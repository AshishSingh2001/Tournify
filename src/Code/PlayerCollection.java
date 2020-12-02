/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Code;

import java.util.*;

import java.io.*;

/**
 * Stores, sorts and searches Team objects
 * <p>
 * 
 * Constructors:
 * <ul>
 * <li>public PlayerCollection()
 * <li>public PlayerCollection(Team t)
 * </ul>
 * <p>
 * 
 * Methods
 * <ul>
 * <li>public int addTeam(Team t)
 * <li>public int addPlayer(Player p)
 * <li>public int playersCount()
 * <li>public int teamCount()
 * <li>public ArrayList<Player> getAllPlayers()
 * <li>public ArrayList<Team> getAllTeams()
 * <li>public void loadPlayers(String file)
 * <li>public void savePlayers(String file)
 * </ul>
 * <p>
 * 
 * COLLABORATORS: Team
 * @author Ashish Kumar Singh
 *
 */
public class PlayerCollection {

    public static final int NO_ERROR = 0;
    public static final int MAX_TEAMS_REACHED = 1;
    public static final int MAX_PLAYERS_REACHED = 2;

    private ArrayList<Team> teams = new ArrayList<>();

    private final int maxTeams = 10;
    private final int maxPlayers = 15;

    public PlayerCollection() {
    }

    /**
     * @param t Initiate the collection with a team
     */
    public PlayerCollection(Team t) {
        teams.add(t);
    }

    /**
     * add a Team object to the PlayerCollection
     *
     * @param t Team object to add
     */
    public void addTeam(Team t) throws SameTeamException {
        if(getTeamIndex(t.getName()) != -1) {
            throw new SameTeamException("");
        }
        teams.add(t);
    }

    /**
     * adds a player to a PlayerCollection and files it in an appropriate team, or
     * creates a new team if none exist for the player
     *
     * @param p player to add to collection
     * @return either one of NO_ERROR, MAX_TEAM_REACHED, or MAX_PALYERS_REACHED
     */
    public int addPlayer(Player p) throws SameTeamException {
        Team t;
        String name = p.getTeamName();
        int result = NO_ERROR;

        int index = getTeamIndex(name);

        if (index == -1) {
            if (teams.size() < maxTeams) {
                t = new Team(name, p);
                addTeam(t);
            } else {
                result = MAX_TEAMS_REACHED;
            }
        } else {
            if (teams.get(index).playerCount() < maxPlayers)
                teams.get(index).addPlayer(p);
            else
                result = MAX_PLAYERS_REACHED;
        }

        return result;
    }

    /**
     * get the entire count of players in the PlayerCollection from all teams
     *
     * @return integer representing total number of players
     */
    public int playersCount() {
        int count = 0;

        for (int i = 0; i < teams.size(); i++)
            count += teams.get(i).playerCount();

        return count;
    }

    /**
     * get number of teams in PlayerCollection
     *
     * @return number of teams
     */
    public int teamCount() {
        return teams.size();
    }

    /**
     * get all players in the PlayerCollection from all teams
     *
     * @return entire collection of players in PlayerCollection from all teams
     */
    public ArrayList<Player> getAllPlayers() {
        ArrayList<Player> allPlayers = new ArrayList<Player>();

        for (int i = 0; i < teams.size(); i++)
            allPlayers.addAll(teams.get(i).getAllPlayers());

        return allPlayers;
    }

    /**
     * get Teams
     *
     * @return Collection of all Teams in the Tournament
     */
    public ArrayList<Team> getAllTeams() {
        return teams;
    }

    /**
     * load entire collection of Players into the manufacturer object from a data
     * file
     *
     * @param file filename of binary file to load Player data from
     */
    public void loadPlayers(String file) throws IOException, ClassNotFoundException {

        ObjectInputStream inp = new ObjectInputStream(new FileInputStream(file));
        teams = (ArrayList<Team>) inp.readObject();
        inp.close();
    }

    /**
     * Save all Players to a binary file
     *
     * @param file of the binary file
     */
    public void savePlayers(String file) throws IOException {
        int flag = 0;
        int items = teams.size();

        if (teams.size() > 0) {
            do {
                flag = 0;
                for (int i = 0; i < items; i++) {
                    if (i + 1 < items) {
                        if (teams.get(i).getTeamName().compareTo(teams.get(i + 1).getTeamName()) > 0) {
                            Collections.swap(teams, i + 1, i);
                            flag++;
                        }
                    }
                }
            } while (flag > 0);

            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file));

            out.writeObject(teams);
            out.close();
        }
    }

    /**
     * Searches the Teams for a given name and return its index
     * 
     * @param teamName Name of the team to be searched
     * @return index of the team found else -1
     */
    public int getTeamIndex(String teamName) {
        for (int i = 0; i < teams.size(); i++) {
            if (teams.get(i).getTeamName().equalsIgnoreCase(teamName)) {
                return i;
            }
        }
        return -1;
    }

    /**
     * return a sorted list of teams
     */
    public final ArrayList<Team> getLeaderboards() {
        
        ArrayList<Team> sorted = new ArrayList<>(teams);
        Collections.sort(sorted, new sortLeaderboard());
        return sorted;
    }

    /**
     * Compares the teams first by points and then matches won,matches draw and
     * matches lost as tie breakers to decide the leader board
     */
    class sortLeaderboard implements Comparator<Team> {

        public int compare(Team a, Team b) {
            if (b.getPoints() != a.getPoints()) {
                return b.getPoints() - a.getPoints();
            } else if (b.getMatchesWon() != a.getMatchesWon()) {
                return b.getMatchesWon() - a.getMatchesWon();
            } else if (b.getMatchesDraw() != a.getMatchesDraw()) {
                return b.getMatchesDraw() - a.getMatchesDraw();
            } else {
                return a.getMatchesDraw() - b.getMatchesDraw();
            }
        }
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException, SameTeamException {

        System.out.println("Test Of Player Collection ");

        Player p1 = new Player("name1", "height", "experience", "position", 1, 1, 1,
        "team", 1);
        Player p2 = new Player("name2", "height", "experience", "position", 2, 1, 1,
        "team", 1);
        Player p3 = new Player("name3", "height", "experience", "position", 3, 1, 1,
        "team", 1);

        Team t1 = new Team("TeamName1", p1);
        t1.addPlayer(p2);
        t1.addPlayer(p3);

        Player p4 = new Player("name4", "height", "experience", "position", 4, 4, 4,
        "team", 4);
        Player p5 = new Player("name5", "height", "experience", "position", 5, 5, 5,
        "team", 5);
        Player p6 = new Player("name6", "height", "experience", "position", 6, 6, 6,
        "team", 6);

        Team t2 = new Team("TeamName2", p4);
        t2.addPlayer(p5);
        t2.addPlayer(p6);

        PlayerCollection pc = new PlayerCollection(t1);

        pc.addTeam(t2);

        ArrayList<Team> pcl = pc.getAllTeams();

        for (Team titer : pcl) {
        System.out.println(titer);
        }

        Player pTemp = new Player("name10", "height", "experience", "position", 10,
        10, 10, "teamSpecial", 10);
        pc.addPlayer(pTemp);

        ArrayList<Player> pl = pc.getAllPlayers();

        for (Player piter : pl) {
        System.out.println(piter);
        }

        t1.updatePoints(-1);
        t2.updatePoints(2);
        ArrayList<Team> leader = pc.getLeaderboards();
        for (Team titer : leader) {
        System.out.println(titer);
        }

        final String file = "cars.dat";
        pc.savePlayers(file);

        // Test the saved file is loading or not

        // final String file = "cars.dat";
        // PlayerCollection ld = new PlayerCollection();
        // ld.loadPlayers(file);

        // ArrayList<Player> pl = ld.getAllPlayers();

        // for (Player piter : pl) {
        //     System.out.println(piter);
        // }

        // ArrayList<Team> pcl = ld.getAllTeams();

        // for (Team titer : pcl) {
        //     System.out.println(titer);
        // }
    }

}