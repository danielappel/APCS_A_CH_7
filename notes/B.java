package notes;

public class B extends A
{

    /**
     * Constructor for objects of class B
     */
    public B()
    {
        super();
    }

    public void firstMethod()
    {
        System.out.println("First Method: B");
    }
    
    public void firstMethod(int num)
    {
        for (int i = 0; i < num; i++)
        {
            System.out.println("Overloaded: B");
        }
    }
}
