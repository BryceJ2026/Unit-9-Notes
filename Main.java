public class Main {

   public static void main(String []args) {
      // Use the default/no-arg constructors
      Vehicle v1 = new vehicle();
      Car c1 = new Car();
      //Use the paraterized constructors
      // ORDER of our units must match formal params!!!
      Vehicle v2 = new Vehicle(3, 10.0, "Olive");
      Car c2 = new Car(4, 300.0, "Blood red", 3,  "Lambo");
      


   }
}
