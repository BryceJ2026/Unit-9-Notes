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

    // 3. Methods
    // toString methods will get called when you pass an object in a print statement
    public String toString() {
 return ("Car[numWheels:" + this.numWheels + ", avgSpeed:" + this.avgSpeed + ", color:" + this.color + "]" );
    }
    public int getNumWheels(){
        return this.numWheels();
    
    
     }

     public boolean getAvgSpeed(){
        return this.avgSpeed();
     }

     public String getColor(){
        return this.color();
     }

     // Behavior methods (can be OVERIDDEN in child classes)
     public void makeNoise() {
        System.out.println("Vroom Vro- *CRASH");
     }

}


    