enum Level {
  LOW,
  MEDIUM,
  HIGH
}

public class JV01_Enum {
  public static void main(String[] args) {

    /* The enum type has a values() method, which returns an array of all enum constants. 
    This method is useful when you want to loop through the constants of an enum: */

    for (Level myVar : Level.values()) {
        System.out.println(myVar);
    }

    // Enums are often used in switch statements to check for corresponding values:
    Level myVar = Level.MEDIUM;

    switch(myVar) {
      case LOW:
        System.out.println("Low level");
        break;
      case MEDIUM:
         System.out.println("Medium level");
        break;
      case HIGH:
        System.out.println("High level");
        break;
    }
  }
}