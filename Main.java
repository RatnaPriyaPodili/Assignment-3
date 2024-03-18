package Assignment3;
//Organization class
class Organization implements Cloneable {
 private int organizationCode;
 private String organizationName;
 private String organizationAddress;

 // Constructor
 public Organization(int organizationCode, String organizationName, String organizationAddress) {
     this.organizationCode = organizationCode;
     this.organizationName = organizationName;
     this.organizationAddress = organizationAddress;
 }

 // Method to print object details
 public void printDetails() {
     System.out.println("Organization Code: " + organizationCode);
     System.out.println("Organization Name: " + organizationName);
     System.out.println("Organization Address: " + organizationAddress);
 }

 // Overriding clone() method to support cloning
 @Override
 protected Object clone() throws CloneNotSupportedException {
     return super.clone();
 }
}

public class Main {
 public static void main(String[] args) {
     // Create an object of Organization
     Organization org1 = new Organization(1, "Org1", "Address1");

     try {
         // Cloning the object
         Organization org2 = (Organization) org1.clone();

         // Printing details of both objects
         System.out.println("Details of Org1:");
         org1.printDetails();

         System.out.println("\nDetails of Cloned Org2:");
         org2.printDetails();
     } catch (CloneNotSupportedException e) {
         System.out.println("Cloning not supported");
         e.printStackTrace();
     }
 }
}
