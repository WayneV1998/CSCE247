//Wayne Vinson III
import java.util.ArrayList;
public class Watchman implements Subject{
	ArrayList<Observer> observers;
	
	// Int variable used for couting updates
	int warning;
	
	public Watchman() 
	{
		//Array List for the watchman
		observers = new ArrayList<Observer>();
	}
	
	public void registerObserver(Observer observer) 
	{
		observers.add(observer);
	}
	
	public void removeObserver(Observer observer) 
	{
		observers.remove(observer);
		
	}
	
	public void notifyObservers() 
	{
		for(Observer observer: observers) 
		{
			observer.update(warning);
		}
		
	}
	
	public void issueWarning(int warning) { 
		if(warning == 1) 
		{
			//If one warning goes off then it will print out 1 trumpet was played
			System.out.println("WARNING:  1 trumpet was played!");
			this.setWarning(warning);
			notifyObservers();
		}
		else 
		{
			//If a second warning goes off then it will print out 2 trumpets were played
			System.out.println("WARNING:  2 trumpets were played!");
			this.setWarning(warning);
			notifyObservers();
		}
	}
	
	//Sets the warning number
	public void setWarning(int warning) 
	{
		this.warning = warning;
	}
}
