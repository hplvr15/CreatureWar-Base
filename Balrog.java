import java.util.Random;

/**
 * Write a description of class Balrog here.
 * @author Hannah Dela Cruz
 * @version 4/25/2016
>>>>>>> origin/master
 */
public class Balrog extends Demon
{
    // instance variables - replace the example below with your own

   Random ran = new Random();

    /**
     * Constructor for objects of class Balrog
     */
    public Balrog()
    {
        // initialise instance variables

        super();
        setHealth(40);
        setStrength(10);
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
