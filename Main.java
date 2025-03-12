import java.util.ArrayList;

public class Main {

   public static void main(String []args) {
      // Use the default/no-arg constructors
      Vehicle v1 = new Vehicle();
      Car c1 = new Car();
      //Use the paraterized constructors
      // ORDER of our units must match formal params!!!
      Vehicle v2 = new Vehicle(3, 10.0, "Olive");
      Car c2 = new Car(4, 300.0, "Blood red", 3,  "Lambo");
      //Test toString methods
      System.out.println(v1);
      System.out.println(v2);
     //System.out.println(c1);


// Test behavior methods
      v2.makeNoise();
      c2.makeNoise(); // OVERIDE PARENT METHOD


         //POLYMORPHISM example:
         //all classes in a hierarchy can be treated as
         // instances of the TOP (must super) type
         Vehicle v3 = new Vehicle();
         Vehicle c3 = new Car();
         //Car bad = new Vehicle(); // Car IS-A type of vehicle

         Vehicle scoot = new Scooter();
         Vehicle moto = new Motorcycle();
         Vehicle voncertable = new Convertable();

         // POLYMORPHISM example:
         // Can store any subclass in a super class-type collection
         ArrayList<Vehicle> vehicleList = new ArrayList<Vehicle>();
         vehicleList.add(v1);
         vehicleList.add(v2);
         vehicleList.add(v3);
         vehicleList.add(c1);
         vehicleList.add(c2);
         vehicleList.add(c3);
         vehicleList.add(moto);
         vehicleList.add(scoot);
         System.out.println(vehicleList);
   }
}
