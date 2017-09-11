package sample.model;

public class PlayDohSnake 
{
	private int size;
	public PlayDohSnake()
	{
		this.size = 10;
	}
	public PlayDohSnake(int size)
	{
		this.size = size;
	}
	public String toString()
	{
		String description = "I am playdoh snake "+ size;
		return description;			
	}//I learned how to create more objects, and change variables such as size, height, etc. this is...
	//....helpful because it lets you change it according to your preferences. Plus, we learned how to..
	//... make the program state the size of the object so we know what it is. 
}