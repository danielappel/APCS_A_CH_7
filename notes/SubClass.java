package notes;


/**
 * Write a description of class SubClass here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SubClass extends SuperClass
{
    // instance variables - replace the example below with your own
    //Uncomment to see duplication
    //public String publicVariable;

    /**
     * Constructor for objects of class SubClass
     */
    public SubClass(String pr, String pub)
    {
        super(pr, pub);
        this.publicVariable = "Declared in SubClass";
        
        //this.privateVariable = "Declared private";
        this.privateMethod();
    }

    public void printVariables(){
        super.printVariables();
        System.out.println("Sub class Variable: " + this.publicVariable);
        System.out.println("Sub class, this.publicVarialbe: " + this.publicVariable);
        System.out.println("Sub class, super.publicVarialbe: " + super.publicVariable);
    }
    
    public void privateMethod() {
        
    }
}
