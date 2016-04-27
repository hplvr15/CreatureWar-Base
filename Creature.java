import java.util.Random;

/**
 * The class serves as the superclass for all the creatures in the war.
 * 
 * author Hannah Dela Cruz
 * version 4/26/2016
 */

public class Creature
{
    protected  int hp = 10;
    protected  int strength = 10;
    protected final int minHP = 5;
    protected final int minStr = 5;

    public Creature()
    {
        setStrength(strength);
        setHealth(hp);
        strength = 10;
    }

    public Creature(int health, int str)
    {
        setHealth(health);
        setStrength(strength);
    }

    /**
     * Returns an int equal to a random number based on the creature's strength.
     */
    
   public int damage()
    {
       Random ran = new Random();
       int damage = ran.nextInt(strength)+1;
       return damage;
    }

    /**
     * Receive a hit 
     * @pram Damage
     */
   
    public void takeDamage(int dmg)
    {
        hp -= dmg;
    }

    /**
     * The setStrength method sets str for the creatures 
     * @param hp
     */
    
    public void setStrength(int str)
    {
        Random ran = new Random();
        strength = str + ran.nextInt(5);
        if(strength < minStr)
        {
            strength = minStr;
        }
    }

    /**
     * The getStrength return strength of the creatures.
     * returns ine health
     */
    
    public int getStrength()
    {
        return strength;
    }
    
    /**
     * The getHealth returns hp of the creatures.
     * returns int health
     */
    
    public int getHealth()
    {
        return hp;
    }
    
    /**
     * The setHealth method sets hp for the creatures 
     * @param hp
     */
    
    public void setHealth(int health)
    {
        Random ran = new Random();
        hp = health + ran.nextInt(5);
        if(health < minHP)
        {
            health = minHP;
        }
    }
    
    
}