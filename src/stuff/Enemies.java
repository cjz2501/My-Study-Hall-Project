package stuff;

public class Enemies
{
	public static void main(String args[])
	{
		Player goblin = new Player();
		//				   S   D  C  I  W  Ch
		goblin.changeStats(10, 5, 3, 1, 2, 1);
		//goblin.StateStats(); // if needed
		goblin.equipWeapon(1);
		
	}
}
