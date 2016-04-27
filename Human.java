import java.util.Random;

/**
 * Write a description of class Human here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Human extends Creature
{
    // instance variables - replace the example below with your own
    private int maxHP = 30;
    private int maxStrength = 18;

    /**
     * Constructor for objects of class Human
     */
    public Human()
    {
        super();
        Random ran = new Random();
        setHealth(ran.nextInt(maxHP)+minHP);
        setStrength(ran.nextInt(maxStrength)+minHP);
    }
}
