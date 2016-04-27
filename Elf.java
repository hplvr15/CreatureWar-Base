import java.util.Random;

/**
 * Write a description of class Elf here.
 * 
 * @author Hannah 
 * @version 
 */
public class Elf extends Creature
{
    // instance variables - replace the example below with your own
    Random ran = new Random();
    
    /**
     * Constructor for which calls superclass
     */
    public Elf()
    {
        // initialise instance variables
        super();
        setHealth(8);
        setStrength(3);
    }

    /**
     * Damages twices when 10%
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
