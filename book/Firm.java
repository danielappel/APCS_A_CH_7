package book;
//********************************************************************
//  Firm.java       Author: Lewis/Loftus/Cocking
//
//  Demonstrates polymorphism via inheritance.
//********************************************************************
public class Firm
{
   //-----------------------------------------------------------------
   // Creates a staff of employees for a firm and pays them.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      Staff personnel = new Staff();
      personnel.payday();
      
      Employee bob = new Executive();
      Executive jane = new Executive();
      Executive joe = new Executive();
      
      //jane = bob //won't work without cast to more functionality
      jane = (Executive)bob;
      //bob = joe;  //ok because it is a widening conversion
      bob = (Employee) jane;
      
      
   }
}