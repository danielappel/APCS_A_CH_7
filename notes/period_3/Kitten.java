package notes.period_3;


/**
 * Write a description of class Kitten here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Kitten extends Cat
{
    int fuzziness;

    /**
     * Constructor for objects of class Kitten
     */
    public Kitten(String s, int a, int fuzz)
    {
        // initialise instance variables
        super(s, a);  
        this.fuzziness = fuzz;
        
    }
    
    public void play()
    {
        System.out.println("Play with me!");
    }

   
}
