package notes;


/**
 * Write a description of class SuperSubDriver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SuperSubDriver
{
    public static void main(String[] args) {
        //Shows what happens when a subclass re-declares an instance variable
        SuperClass sup = new SuperClass("Super Private", "Super Public");
        SubClass sub = new SubClass("Sub Private-Const", "Sub Private-Const");
        sup.printVariables();
        sub.printVariables();
    }
}
