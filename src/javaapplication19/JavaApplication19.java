
package javaapplication19;


public class JavaApplication19 {

   
    public static void main(String[] args) {
               WorkshopRegistration reg = new WorkshopRegistration();
        try {
            reg.registerParticipant("Ahmed", 16);
        } catch (InvalidAgeException e) {
            System.out.println("Caught: " + e.getMessage());
        }

    }
    
}
