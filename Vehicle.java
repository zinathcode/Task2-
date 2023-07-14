public class Vehicle {

    public String brand = "Suzuki";        // Vehicle attribute
  private int x = 240067;                  // Variable decleration
  public void colour(){                    // Vehicle method
    System.out.println("Bike number is : " +x);
    System.out.println("Metallic Sonic Silver");

  }
}

class Bike extends Vehicle {
  private String modelName = "Suzuki Hayabusa";    // Bike attribute
  public static void main(String[] args) {

    // Create a myBike object
    Bike myBike = new Bike();

    // Call the colour() method (from the Vehicle class) on the myBike object
    myBike.colour();

    // Display the value of the brand attribute (from the Vehicle class) and the value of the modelName from the Bike class
    System.out.println(myBike.brand);
    System.out.println( myBike.modelName);
  }
    
}
