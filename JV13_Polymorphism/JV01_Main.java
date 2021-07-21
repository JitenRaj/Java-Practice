class JV01_Animal {
  public void animalSound() {
    System.out.println("The animal makes a sound");
  }
}

class JV01_Pig extends JV01_Animal {
  public void animalSound() {
    System.out.println("The pig says: wee wee");
  }
}

class JV01_Dog extends JV01_Animal {
  public void animalSound() {
    System.out.println("The dog says: bow wow");
  }
}

class JV01_Main {
  public static void main(String[] args) {
    JV01_Animal myAnimal = new JV01_Animal();  // Create a Animal object
    JV01_Animal myPig = new JV01_Pig();  // Create a Pig object
    JV01_Animal myDog = new JV01_Dog();  // Create a Dog object
    myAnimal.animalSound();
    myPig.animalSound();
    myDog.animalSound();
  }
}