package labs.apcs_ch_7_lab_1;

// ****************************************************************
// ListTest.java
//
// A simple test program that creates an IntList, puts some 
// ints in it, and prints the list.
//          
// ****************************************************************

public class ListTest
{
    public static void main(String[] args)
    {
	IntList myList = new IntList(10);
	myList.add(100);
	myList.add(50);
	myList.add(200);
	myList.add(25);
	System.out.println(myList);
	
	System.out.println();
	System.out.println("Using a Sorted List");
	
	SortedIntList betterList = new SortedIntList(10);
	betterList.add(100);
	betterList.add(50);
	betterList.add(200);
	betterList.add(25);
	System.out.println(betterList);
	
    }
}
