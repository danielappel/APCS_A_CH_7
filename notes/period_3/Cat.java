package notes.period_3;


/**
 * Write a description of class Cat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cat extends Animal
{

    /**
     * Constructor for objects of class Cat
     */
    public Cat(String s, int a)
    {
        super(s, a);
    }
    
    public void workAround()
    {
        //super.noAccess();
    }
    
    public void sayName()
    {
        System.out.println("Cat Say Name Method!!");
        
    }
    
    public void meow()
    {
        System.out.println("meow!!");
    }

}
