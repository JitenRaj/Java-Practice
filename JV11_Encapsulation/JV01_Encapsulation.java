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
  public class JV01_Encapsulation {
    public static void main(String[] args) {
      JV01_Private_Encap myObj = new JV01_Private_Encap();
      myObj.setName("Jiten"); // Set the value of the name variable to "Jiten"
      System.out.println(myObj.getName());
    }
  }
