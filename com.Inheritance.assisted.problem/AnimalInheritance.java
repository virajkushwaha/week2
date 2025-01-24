class Animal{
    private String name;
    private int age;
    
    //Constructor 
    Animal(String name , int age){
        this.name = name;
        this.age = age;
    }
    //method make sound 
    public void makeSound(){

    }


}

class Dog extends Animal{
    //Constructor 
    Dog(String name , int age){
        super(name, age);
    }
    @Override
    //overriding makeSound method
    public void makeSound() {   
        System.out.println("Woof");
        }
    

}

class Cat extends Animal{
    //Constructor 
    Cat(String name , int age){
        super(name, age);
    }
    @Override
    //overriding makeSound method
    public void makeSound() {   
        System.out.println("Meow");
        }
    
        
}

class Bird extends Animal{
    //Constructor 
    Bird(String name , int age){
        super(name, age);
    }
    @Override
    //overriding makeSound method
    public void makeSound() {   
        System.out.println("chirp chirp");
        }
    
        
}

public class AnimalInheritance{
    public static void main(String[] args) {
        //creating objects of each class
        Dog dog = new Dog("Buddy", 3);
        Cat cat = new Cat("Whiskers", 2);
        Bird bird = new Bird("Sunny", 1);
        //calling makeSound method on each object
        dog.makeSound();
        cat.makeSound();
        bird.makeSound();

    }
}