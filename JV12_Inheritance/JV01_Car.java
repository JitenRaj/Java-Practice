class JV01_Car extends JV01_Vehicles {
  public String modelName = "Mustang";    // Car attribute
  public static void main(String[] args) {

    // Create a myCar object
    JV01_Car myCar = new JV01_Car();

    // Call the honk() method (from the Vehicle class) on the myCar object
    myCar.honk();

    // Display the value of the brand attribute (from the Vehicle class) and the value of the modelName from the Car class
    System.out.println(myCar.brand + " " + myCar.modelName);
  }
}