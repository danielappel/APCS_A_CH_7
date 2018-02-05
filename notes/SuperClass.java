package notes;


/**
 * Write a description of class SuperClass here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SuperClass
{
    private String privateVariable;
    public String publicVariable;

    /**
     * Constructor for objects of class SuperClass
     */
    public SuperClass(String priv, String pub)
    {
        this.privateVariable = priv;
        this.publicVariable = pub;
    }

    public void printVariables() {
        System.out.print("Superclass variables: ");
        System.out.print("Private: " + privateVariable);
        System.out.println("Public: " + publicVariable);
        privateMethod();
        this.privateVariable = "here";
    }
    
    private void privateMethod() {
        
    }
}
