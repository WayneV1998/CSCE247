//Wayne Vinson III
public class ShopOwner extends Watchman implements Observer{
	private Subject Watchmen;
	
	public ShopOwner(Subject watchmen) 
	{
		this.Watchmen = watchmen;
		watchmen.registerObserver(this);
	}

	public void update(int warning) 
	{
		if (warning == 1) 
		{
			System.out.println("Shop Owner: Close down shop and head home!");
		} 
		else 
		{
			System.out.println("Shop Owner: Drops everything and find nearest hideout!");
		}
	}
}
