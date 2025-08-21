class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
        
  
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
    
    
    
}

public class Inheritance2 {
    public static void main(String[] args) {
    	Dog a = new Dog();  // Upcasting
        a.sound(); 
       
      
        // Output: Dog barks
    }
}