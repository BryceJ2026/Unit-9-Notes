/* Car is a SUBCLASS (CHILD) that INHEIRITS from VEhicle "Car IS-A type of vehicle"
*/

public class Car extends Vehicle {
   //Attributes specific to a car
   private int numSeats;
   private String carBrand;

   //Constructors are not inheirited!

   public Car(){
    super(); // Call to super class
    this.numSeats = 5;
    this.carBrand = "Vroom";
   }

   public Car(int numWheels, double avgSpeed, String color, int numSeats, String carBrand){
    //Must call super() FIRST
    //before setting up the other vars
    super(numWheels, avgSpeed, color);
    this.numSeats = numSeats;
    this.carBrand = carBrand;
   }

   public String toString() {
      return ("Vehicle[numWheels:" + this.getNumWheels() + ", avgSpeed:" + this.getAvgSpeed() + ", color:" + this.getColor() +  ", numSeats" + this.numSeats + ", carBrand" + this.carBrand + "]" );
         }

}

//OVERIDE parent method
public void makeNoise() {
   // USE super.method to call the paent's method FIRST
   super.makeNoise();
   //Then add on to that behavior
   System.out.println("Beep BOOP");
}

