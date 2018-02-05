package notes.period_2;


/**
 * Write a description of class Kitten here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Kitten extends Cat
{
    // instance variables - replace the example below with your own
  

    /**
     * Constructor for objects of class Kitten
     */
    public Kitten(String s, int a)
    {
        // initialise instance variables
        super(s, a);
    }

    public void meow()
    {
        //override of cat's meow
        System.out.println("I'm little");
        super.meow();
    }
}
