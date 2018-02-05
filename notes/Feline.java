package notes;


/**
 * Write a description of class Feline here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Feline extends Animal
{
    // instance variables - replace the example below with your own
    
    //Overite the instance variables from Animal
    public String name = "CAT";
    private int age = -1;

    /**
     * Constructor for objects of class Feline
     */
    public Feline(String s, int a)
    {
        // initialise instance variables
        super(s, a);  
    }
    
    public void tryAccess()
    {
        //Access to instance variables
        System.out.println(this.age);
        System.out.println(this.name);
        
        //Methods
        //noAccess();
        workAround();
    }
    
    public void whichVariables()
    {
        System.out.println("Which variables are used?");
        System.out.println("From super class: " + " , " + super.name);
        System.out.println("From this class: " + age + " , " + name);
    }

    
}
