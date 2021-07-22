// Abstract class
abstract class JV01_Animal {
  // Abstract method (does not have a body)
  public abstract void animalSound();
  // Regular method
  public void sleep() {
    System.out.println("Zzz");
  }
}

// Subclass (inherit from Animal)
class JV01_Pig extends JV01_Animal {
  public void animalSound() {
    // The body of animalSound() is provided here
    System.out.println("The pig says: wee wee");
  }
}

class JV01_Abstraction_Example {
  public static void main(String[] args) {
    JV01_Pig myPig = new JV01_Pig(); // Create a Pig object
    myPig.animalSound();
    myPig.sleep();
  }
}