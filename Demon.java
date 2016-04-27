import java.util.Random;

/**
 * Write a description of class Demon here.
 * 
 * @author Hannah Dela Cruz 
 * @version 4/26/2016
 */
public class Demon extends Creature
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Demon
     */
    public Demon()
    {
        // initialise instance variables
        super();
        setHealth(15);
        setStrength(8);
    }

    /**
     * Sets the damage additional 50 when there is a 5% chance
     */
    public int damage()
    {
        // put your code here
        Random ran = new Random();
        int damage = ran.nextInt(strength) + 1;
        int crit = ran.nextInt(100) + 1;
        if(crit == 5)
        {
            damage = damage + 50;
        }
        
        damage = damage + ran.nextInt(strength) + 1;
        crit = ran.nextInt(100) + 1;
        if(crit == 5)
        {
            damage = damage + 50;
        }
        
        return damage;
    }
}
