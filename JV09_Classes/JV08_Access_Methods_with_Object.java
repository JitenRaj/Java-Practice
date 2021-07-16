// carFeatures class
class CarsFeatures {

    // fullThrottle() method
    public void fullThrottle() {
        System.out.println("The car is going as fast as it can.");
    }

    // Speed() method
    public void Speed( int maxSpeed) {
        System.out.println("Max Speed of the car is " + maxSpeed );
    }
}

// Main Class
public class JV08_Access_Methods_with_Object {
    public static void main(String[] args) {
        // Creating object and calling CarFeatures class's methods in main()
        CarsFeatures car = new CarsFeatures();
        car.fullThrottle();
        car.Speed(200);
    }
}
