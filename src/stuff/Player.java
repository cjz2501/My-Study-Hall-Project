package stuff;

public class Player
{
	int strength = 0;
	int dexterity = 0;
	int constitution = 0;
	int intelligence = 0;
	int wisdom = 0;
	int charisma = 0;
	int maxHealth = (constitution/100) * 200;
	int currentHealth = 0;
	int experience = 0;
	int itemValue = 0;
	
	
	
	public void changeExp(int currentExp)
	{
		experience = currentExp;
	}
	public void changeHealth(int damageTaken)
	{
		currentHealth = currentHealth - damageTaken;
	}
	//this should only be accessed by console
	public void changeStats(int setStr, int setDex, int setCon, int setInt, int setWis, int setChr)
	{
		strength = setStr;
		dexterity = setDex;
		constitution = setCon;
		intelligence = setInt;
		wisdom = setWis;
		charisma = setChr;
	}
	public void StateStats()
	{
		System.out.println("Str: "+ strength+ "\n" + "Dex: "+ dexterity +"\n" +"Con: "+ constitution+"\n" +"Int: " + intelligence+"\n" +"Wis: " + wisdom+"\n" + "Chr: "+charisma );
	}
	public void equipWeapon(int weaponDataValue)
	{
		itemValue = weaponDataValue;
	}
	public void monsterDamage(int monsterWeapon)
	{
		if(itemValue == monsterWeapon)
		{
			//Monster has a sword
			
		}
	}
}

