package stuff;

import java.util.*;
public class Story
{
	
	public static Scanner kbReader;
	public static Scanner Reader;
	
	public static void main(String args[])
	{
		kbReader = new Scanner(System.in);
		Reader = new Scanner(System.in);
		System.out.println("Would you like to Start?");
		System.out.println("	1. Begin Game");
		System.out.println("	2. Stop Game");
		int begin = kbReader.nextInt();
		boolean start = false;
		if(begin == 1)
		{
			start = true;
		}
		else if (begin == 2)
		{
			start = false;
		}
		else
		{
			System.out.println("Babe Plz learn numbers.");
		}
		if(start == true)
		{
			System.out.println("Young Hero, What is your name?");
			String characterName;
			characterName = Reader.nextLine();
			System.out.println("\nNow which class do you wish to select?");
			System.out.println("\n 1. The Knight\n 2. The Archer\n 3. The Rouge\n 4. The Wizard\n 5. The Paladin");
			int archetype;
			int race;
			do
			{
			archetype = kbReader.nextInt();
			
						
			}while(archetype > 5);
			System.out.println("Now please select the race of character you wish to be!");
			System.out.println("\n 1. Elf\n 2. Human\n 3. Lizardman\n 4. Frogman\n 5. Dwarf");
			do
			{
				race = kbReader.nextInt();
			}while (race >5);
			if (archetype == 1)
			{
				System.out.println("You have selected the Knight class");
			}
			else if (archetype == 2)
			{
				System.out.println("You have selected the Archer class");
			}
			else if (archetype == 3)
			{
				System.out.println("You have selected the Rouge class");
			}
			else if (archetype == 4)
			{
				System.out.println("You have selected the Wizard class");
			}
			else if (archetype == 5)
			{
				System.out.println("You have selected the Paladin class");
			}
			else
			{
				System.out.println("This is bad if it happens!");
			}
			
			if (race == 1)
			{
				System.out.println("You have selected the race of Elf");
			}
			else if (race == 2)
			{
				System.out.println("You have selected the race of Human");
			}
			else if (race == 3)
			{
				System.out.println("You have selected the race of Lizardman");
			}
			else if (race == 4)
			{
				System.out.println("You have selected the race of Frogman");
			}
			else if (race == 5)
			{
				System.out.println("You have selected the race of Dwarf");
			}
			else
			{
				System.out.println("Yup this is real bad!");
			}
			System.out.println("\n Are you okay with this selection?\n  1. Yes\n  2. No");
			int proceedThroughCharacterDev = kbReader.nextInt();
			if (proceedThroughCharacterDev == 1)
			{
				//1ActualPlayer player = new ActualPlayer(characterName, archetype, race);
				System.out.println("Ok, " + characterName +" your quest of adventure and fun is about to begin.");
				System.out.println("\nThe land of Sacshire is bustling with busy cities, and deep relics of the past.\nThe king is gone and your experience is solely based on your actions.");//Refering to Sacral, and or sacred
				System.out.println("Will you become the new king, or will you become just another commoner? The choice is up to you!\n\n\n");
				System.out.println("You wake up in a dank cellar");
				System.out.println("Around the room there are barrels knocked over with their contents strewn across the floor.");
				
			}
			else
			{
				System.out.println("Reseting Program!");
			}
		}
			
		else
		{
			System.out.println("Well you stink!");
		}
	}
	
}
