package notes.period_2;


/**
 * Write a description of class Cat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cat extends Animal
{
    // instance variables - replace the example below with your own
    

    /**
     * Constructor for objects of class Cat
     */
    public Cat(String s, int a)
    {
        // initialise instance variables
        super(s, a);  //call the super constructor
    }

    public void meow()
    {
        System.out.println("Meow!!");
    }
}
