package book;


/**
 * Abstract class StaffMember - write a description of the class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class StaffMember
{
    private String name;
    private String address;
    private String phone;
    
    public StaffMember (String eName, String eAddress, String ePhone) {
         name = eName;
         address = eAddress;
         phone = ePhone;
    }
    
    public StaffMember() {
        
    }
    
    public String toString() {
        String result = "Name: " + name + "\n";
        result += "Address: " + address + "\n";
        result += "Phone: " + phone;
        
        return result;
    }
    
    public abstract double pay();
}
