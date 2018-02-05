package notes.period_2;


/**
 * Write a description of class Animal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Animal
{
    // instance variables - replace the example below with your own
    private int age;
    public String name;

    /**
     * Constructor for objects of class Animal
     */
    public Animal(String s, int a)
    {
        // initialise instance variables
        this.name = s;
        this.age = a;
    }

    public void sayName()
    {
        System.out.println("Hello I am " + name);
    }
    
    private void noAccess()
    {
        System.out.println("Can't touch me!");
    }
    
    public void workAround()
    {
        noAccess();
    }
}
