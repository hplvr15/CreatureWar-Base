import java.util.Random;

/**
 * Write a description of class Elf here.
 * @author Hannah Dela Cruz
 * @version 4/25/2016
 */
public class Elf extends Creature
{
    Random ran = new Random();

    /**
     * Constructor for objects of class Elf
     */
    public Elf()
    {
        super();
        setHealth(8);
        setStrength(3);
    }

    /**
     * Damages twices when 10% chance
     */
    public int damage()
    {
        // put your code here
        Random ran = new Random();
        int damage = ran.nextInt(strength) + 1;
        int crit = ran.nextInt(10)+1;
        if(crit == 10)
        {
            damage = damage*2;
        }
        
        return damage;
    }
   
}
