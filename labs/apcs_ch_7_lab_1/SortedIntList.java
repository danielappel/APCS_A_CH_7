package labs.apcs_ch_7_lab_1;


/**
 * Write a description of class SortedIntList here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SortedIntList extends IntList
{
        private int insertionPoint;

        /**
         * Constructor for objects of class SortedIntList
         */
        public SortedIntList(int size)
        {
            super(size);
        }
    
       public void add(int value)
        {
            if (numElements == list.length)
                System.out.println("Can't add, list is full");
            else
                {
                if (numElements ==0){
                    list[0] = value;
                    numElements++;
                }
                else {
                    int location = findInsertionPoint(value);
                    shiftArray(location);
                    list[location] = value;
                    numElements++;
                }
            }
        }
        
        public int findInsertionPoint(int value) {
            int location = 0; 
            for (int i = 0; i < list.length; i++) {
                if (list[i] > value || list[i]==0) {
                    location = i;
                    break;
                }
            }
            
            return location;
        }
        
        public void shiftArray(int location) {
              for (int i = list.length -1; i > location; i--) {
                  list[i] = list[i-1];
                }
        }
}
