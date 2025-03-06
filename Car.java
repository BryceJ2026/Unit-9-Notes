/* Car is a SUBCLASS (CHILD) that INHEIRITS from VEhicle "Car IS-A type of vehicle"
*/

public class Car extends Vehicle {
   //Attributes specific to a car
   private int numSeats;
   private String carBrand;

   //Constructors are not inheirited!

   public Car(int numSeats, String carBrand){
    super(); // Call to super class
    this.numSeats = 5;
    this.carBrand = "Vroom";
   }

   public Car(int numWheels, double avgSpeed, String color, int numSeats, String carBrand){
    //Must call super() FIRST
    //before setting up the other vars
    super(numWheels, avgSpeed, color)
    this.numSeats = numSeats;
    this.carBrand = brand;
   }

}