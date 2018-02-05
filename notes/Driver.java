package notes;

public class Driver
{
    public static void main(String[] args)
    {
        Animal annie = new Animal("Annie", 12);
        Animal callie = new Feline("Callie", 13);
        Feline max = new Feline("Max", 10);
        
        //Casting objects with inheritance
        annie = max;
        max = (Feline)annie;  //needs to be cast as it is narrowing
        callie = annie;  //doesn't need to be cast as it is already Animal
        callie = (Animal)max; //Cast is NOT needed here, but won't kick error
        
        annie.sayName();
        callie.sayName();
        callie.workAround();
        System.out.println("Which name is used?");
        max.sayName();
        max.whichVariables();
        
        //Second Part
        System.out.println("#1:");
        Feline f = new Feline("F", 2);
        f.tryAccess();
    }
}
