package stuff;
public class Weapons
{
	public Weapons(int dmg, double acc, double strValue, double dexValue, double conValue, double intValue, double wisValue, double chrValue, int ID)
	{
		damage = dmg;
		accuracy = acc;
		strScale = strValue;
		dexScale = dexValue;
		conScale = conValue;
		intScale = intValue;
		wisScale = wisValue;
		chrScale = chrValue;
		itemID = ID;
		
	}
	public int damage = 0;
	public double accuracy = 0;
	public int level = 0;
	public double strScale = 0;
	public double dexScale = 0;
	public double conScale = 0;
	public double intScale = 0;
	public double wisScale = 0;
	public double chrScale = 0;
	public int itemID = 0;
	public void changeDamage(int damageValue)
	{
		damage = damageValue;
	}
	public void changeAccuracy(int accuracyValue)
	{
		accuracy = accuracyValue;
	}
	public void changeLevelReq(int levelValue)
	{
		level = levelValue;
	}
	public void printStates()
	{
		System.out.println("Damage: " + damage + "\nAccuracy: " + accuracy + "\nLevel Requirement: " + level + "\nStrength Scale: " + strScale + "\nDexterity Scale: " + dexScale + "\nConstitution Scale: " + conScale + "\nIntellect Scale: " + intScale + "\nWisdom Scale: " + wisScale + "\nCharisma Scale: " + chrScale);
	}
	// void
}
