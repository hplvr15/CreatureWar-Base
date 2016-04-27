import java.util.Random;

/**
 * Write a description of class Demon here.
 * @author Hannah Dela Cruz 
 * @version 4/26/2016
 */
public class Demon extends Creature
{

    /**
     * Constructor for objects of class Demon
     */
    public Demon()
    {
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
        
        return damage;

    }

}
