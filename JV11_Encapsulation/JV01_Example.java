class Person {
    private String name; // private = restricted access
  
    // Getter
    public String getName() {
      return name;
    }
  
    // Setter
    public void setName(String newName) {
      this.name = newName;
    }
  }

  /*

  //Note: Here in this block, we cant access private string name

  public class Main {
  public static void main(String[] args) {
    Person myObj = new Person();
    myObj.name = "Jiten";  // error
    System.out.println(myObj.name); // error 
  }
}

*/

/*
However, we can provide public get and set methods to access 
and update the value of a private variable.
 */
  public class JV01_Example {
    public static void main(String[] args) {
      Person myObj = new Person();
      myObj.setName("Jiten"); // Set the value of the name variable to "John"
      System.out.println(myObj.getName());
    }
  }
