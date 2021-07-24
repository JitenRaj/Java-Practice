interface JV02_FirstInterface {
  public void myMethod(); // interface method
}

interface JV02_SecondInterface {
  public void myOtherMethod(); // interface method
}

class JV02_DemoClass implements JV02_FirstInterface, JV02_SecondInterface {
  public void myMethod() {
    System.out.println("Some text..");
  }
  public void myOtherMethod() {
    System.out.println("Some other text...");
  }
}

class JV02_Interface_Example {
  public static void main(String[] args) {
    JV02_DemoClass myObj = new JV02_DemoClass();
    myObj.myMethod();
    myObj.myOtherMethod();
  }
}