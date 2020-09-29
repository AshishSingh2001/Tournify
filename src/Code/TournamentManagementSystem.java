package Code;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lancelot
 */
public class TournamentManagementSystem {
    
    static PlayerCollection pc;
    static MatchSchedule ms;
    
    void addNewPlayer(Player p) {
        pc.addPlayer(p);
        
    }
            
    TournamentManagementSystem() {
            try
		{
			carCollection.loadCars(file);
		}
		catch (java.io.FileNotFoundException exp)
		{
			System.out.println("The data file, 'cars.dat' doesn't exist. Plase create an empty file named 'cars.dat'");
			System.exit(0);
		}
		// empty cars.dat file, this error should be ignored
		catch (java.io.EOFException exp){}
		catch (java.io.IOException exp)
		{
			System.out.println("The data file, 'cars.dat' is possibly corrupted. Please delete it and create a new empty data file named cars.dat");
			System.exit(0);
		}
		catch (Exception exp)
		{
			System.out.println("There was an error loading 'cars.dat'. Try deleting and creating a new empty file named 'cars.dat'");
			System.exit(0);
		}
    }
            
    public static void main(String[] args) {
        
    }
}
