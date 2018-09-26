package stuff;

public class ActualPlayer 
{
	String playerName;
	int playerClass;
	int playerRace;
	public int str;
	public int dex;
	public int con;
	public int inte;
	public int wis;
	public int chr;
	public ActualPlayer(String characterName, int selectedClass, int selectedRace)
	{
		playerClass = selectedClass;
		playerRace = selectedRace;
		playerName = characterName;
	}
	public void classRaceStatistics()
	{
			if(playerClass == 1)//Knight
			{
			str = 15;
			dex = 5;
			con = 10;
			inte = 5;
			wis = 10;
			chr = 15;
			}
			else if(playerClass == 2)//Archer
			{
			str = 5;
			dex = 15;
			con = 10;
			inte = 10;
			wis = 10;
			chr = 10;
			}
			else if(playerClass == 3)//Rouge
			{
			str = 10;
			dex = 10;
			con = 5;
			inte = 5;
			wis = 15;
			chr = 10;
			}
			else if(playerClass == 4)//Wizard
			{
			str =  5;
			dex = 5;
			con = 10;
			inte = 15;
			wis = 15;
			chr = 5;
			}
			else if (playerClass == 5)//Paladin
			{
			str = 10;
			dex = 5;
			con = 15;
			inte = 5;
			wis = 15;
			chr = 10;
			}
			else
			{
				System.out.println("Whatever happened it was bad, real bad.");
			}
			
			if (playerRace == 1)//Elf
			{
			dex = dex + 10;
			}
			else if(playerRace == 2)//Human
			{
			chr = chr + 5;
			wis = wis + 5;
			}
			else if(playerRace == 3)//LizardMan
			{
			inte = inte + 10;
			}
			else if(playerRace == 4)//Frogman
			{
			str = str + 10;
			}
			else if(playerRace == 5)//Dwarf
			{
			con = con + 10;
			}
			else
			{
				System.out.println("error in playerRace if statement");
			}
	}
}

