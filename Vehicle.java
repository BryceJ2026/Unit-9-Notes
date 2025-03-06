/* Vehicle is a SUPERCLASS (PARENT)
Put the most general attributes + behaviors in this class definition!
Java class can have multiple CHILDREN, but ONLY ONE PARENT
*/
public class Vehicle {
    // INSTANCE VARIABLES
    private int numWheels;
    private double avgSpeed;
    private String color;

    // 2. CONSTUCTORS
    //Method to intialize all variables


    public Vehicle() {
this.numWheels = 4;
this.avgSpeed = 60;
this.color = "White"; 
    }

    //Constructor with formal parameters
    public Vehicle(int numWheels, double avgSpeed, String color){
        //INITIALIZE to passed arguements
        this.numWheels = numWheels;
        this.avgSpeed = avgSpeed;
        this.color = color;
    }

}


    