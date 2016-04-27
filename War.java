import java.util.*;

/**
 * Write a description of class War here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class War
{
    public War()
    {
    }

    /**
     * Creates two armies of creatures and has them battle each other
     * Show results of who won the battle
     */
    public void battle()
    {
        // put your code here
        int i = 0;
        
        ArrayList<Creature> army1 = new ArrayList<Creature>();
        ArrayList<Creature> army2 = new ArrayList<Creature>();
        
        for(i = 0; i < 30; i++)
        {
            army1.add(i, new Human());
            army2.add(i, new Human());
        }
        
        army1.add(10, new Elf());
        army2.add(10, new Elf());
        army2.add(20, new Balrog());
        army2.add(20, new Balrog());
        
        int armyOneIndex = 0;
        int armyTwoIndex = 0;
        System.out.println("Let the WAR begin!");
        
        while(armyOneIndex < army1.size() && armyTwoIndex < army2.size())
        {
           {
                army1.get(armyOneIndex).takeDamage(army2.get(armyTwoIndex).damage()); 
                army2.get(armyTwoIndex).takeDamage(army1.get(armyTwoIndex).damage());
            }
            
             if(army1.get(armyOneIndex).getHealth()<0 && army2.get(armyTwoIndex).getHealth()<0)
             {
            armyOneIndex++;
            armyTwoIndex++;
            System.out.println("No one is left!");
            }
        
            else if(army1.get(armyOneIndex).getHealth() < 0)
            {
            armyOneIndex++;
            System.out.println("A creature dies from the first army.");
        }
        
            else if(army2.get(armyTwoIndex).getHealth() < 0)
            {
            armyTwoIndex++;
            System.out.println("A creature dies from  the second army.");
        }
       }
                
        String result = "";
        System.out.println("Army 1 Number of Deaths: " + armyOneIndex++);
        System.out.println("Army 2 Number of Deaths: " + armyTwoIndex++);
        if(armyOneIndex < 23 && armyTwoIndex < 23)
        {
            result = "NOBODY!";
        }
        else if(armyOneIndex < 23)
        {
            result = "ARMY 2!";
        }
        else if(armyTwoIndex < 23)
        {
            result = "ARMY 1!";
        System.out.println(result + " is the victorious winner of the battle.");
    }
    }
    
}
