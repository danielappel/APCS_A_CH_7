package notes.period_3;


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
        
        Cat callie = new Cat("Callie", 10);
        
        Animal max = new Cat("Max", 2);
        max.sayName();
        
        Kitten kit = new Kitten("Kit", 0, 100);
        //kit.play();
        kit.sayName(); //animal say name
        kit.meow();
        System.out.println("Fuzziness " + kit.fuzziness);
        
        //Casting between subclasses (only for narrowing, moving up to superclass)
        annie = callie; //ok as it is broadening
        //annie.meow();  //still cannot meow as declared as Animal
        callie = (Cat)max; //must be cast as callie would move from cat to animal
        callie.meow(); //can still meow as max was a cat
        
        kit = (Kitten)annie;  //also an acceptable cast
        System.out.println(kit.fuzziness);
        
        
        
        
        
        
        annie.sayName();
        callie.sayName();
        
        callie.workAround();
        callie.meow();
        //annie.meow();
        //System.out.println("Instance variable " + annie.age);
    }
}
