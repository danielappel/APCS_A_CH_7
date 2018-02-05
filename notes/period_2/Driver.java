package notes.period_2;


/**
 * Write a description of class Driver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Driver
{
    public static void main(String[] args)
    {
        Animal annie = new Animal("Annie", 12);
        
        Cat callie = new Cat("Callie", 5);
        
        Animal max = new Cat("Max", 7);
        max.sayName();
        //max.meow();
 
        Cat kit = new Kitten("Kit", 0);
        kit.meow();
        
        //Examples of casting (narrowing conversion)
        annie = max; //ok
        //max = kit; // ok
        
        kit = (Kitten)max; //will narrow kit to be an animal--needs a cast
        kit = (Cat)max;  //either cast will work as kit is both a kitten and a cat
        
       
        
        
        
        annie.sayName();
        System.out.println(annie.name);
        System.out.println(callie.name);
        
        callie.sayName();
        callie.meow();
        callie.workAround();
    }
}
