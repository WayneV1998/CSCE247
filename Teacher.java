//Wayne Vinson III
public class Teacher extends Watchman implements Observer{
	public Subject Watchmen;
	
	public Teacher(Subject watchmen) 
	{
		this.Watchmen = watchmen;
		watchmen.registerObserver(this);
	}

	public void update(int warning) 
	{
		if(warning == 1) 
		{
			System.out.println("Teacher: Helps get every kid home safe!");
		} 
		else 
		{
			System.out.println("Teacher: Brings all students to the underground shelter!");
		}
	}
}
