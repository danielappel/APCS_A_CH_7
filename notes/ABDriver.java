package notes;

public class ABDriver
{
    public static void main(String[] args)
    {
        A first = new A();
        A second = new B();
        B third = (B)second;  //is now a full-fledged B object
        //B fourth = (B)first;
        
        
        System.out.print("#3 :");
        first.firstMethod();
        
        System.out.print("#4 :");
        second.firstMethod();
        //second.firstMethod(3);
        System.out.print("#5 :");
        third.firstMethod();
        
        System.out.print("#6 :");
        third.firstMethod(3);
        //fourth.firstMethod(3);
        
        System.out.print("#7 :");
        C fifth = new C();
        fifth.firstMethod();
        
    }

}
