package labs.apcs_ch_7_lab_1;

public class DogTest
{
    public static void main(String[] args)
    {
	Dog dog = new Yorkshire("Spike");
	System.out.println(dog.getName() + " says " + dog.speak());

    }
}
