
public class GamerManager {
	
	private Logger[] loggers;

	// referance
	public GamerManager(Logger[] loggers) {
		this.loggers = loggers;
	}
	
	// Simulation of DB.
	public Gamer[] register(Gamer gamer, Gamer[] gamers) {
		// make an array with +1 bigger size
		Gamer[] newGamers = new Gamer[gamers.length + 1];
		
		// copy the contents of old array
		for (int i = 0; i< gamers.length; i++) {
			newGamers[i] = gamers[i];
		}
		newGamers[newGamers.length-1] = gamer; 
		return newGamers;
	}
	public void signUp(Gamer gamer) {
		System.out.println(gamer.getName() + " signed up");
		Utils.runLoggers(loggers, gamer.getName());
	}
	
	// to updateBudget auth is required.
	public boolean isSignedIn(Gamer gamer, Gamer[] gamers){
		for (Gamer user : gamers) {
			if (user == gamer) {
				return true;
			}
		}
		return false;
	}
	public void updateBudget(Gamer gamer, double budget, boolean isSignedIn){
		if(isSignedIn) {
			 double newBudget;
			 newBudget = gamer.getBudget() + budget;
			 gamer.setBudget(newBudget);
			 Utils.runLoggers(loggers, "new budget is :" + String.valueOf(newBudget));
		}
		else{
			Utils.runLoggers(loggers, "password or username wrong");
		}
	}
	
	public void deleteGamerStatistics(Gamer gamer, boolean isSignedIn) {
		if(isSignedIn) {
			gamer.setWinRate(0);
			Utils.runLoggers(loggers, "Statistics deleted, current winRate is now 0");
		}
		else {
			Utils.runLoggers(loggers, "password or username wrong");
		}
	}
	


}
