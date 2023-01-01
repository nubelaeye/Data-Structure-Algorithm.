public class Lecture14_OOPS {
    public static void main(String[] args) {

        Pen penColor = new Pen();
        penColor.setColor("Blue");
        System.out.println(penColor.getColor());

        Pen penTip = new Pen();
        penTip.setTip(5);
//         hey
        System.out.println(penTip.getTip());

        BankAccount bankAccount = new BankAccount();
        bankAccount.UserName = "Hacker.com";
        bankAccount.setPassword("YouKnowWhat");  
        
        // There are four PILLERS of OOPS which are...
        // 1. Encapsulation - Encapsulation is defined as the storing of data and methods in a single unit is called Encapsulation... 
        // 2. Inheritence - Inheritence is when properties and functions of base class (base) to the child class (Derived)..
        // 3. Polymorphism - Polymorphism it basically means that the condition of occurring in several different forms. It has two types -> Compile Time Polmorphism(Method OverLoading..) and Run Time Polymorphism(Method OverRidding..)
        // 4. Abstraction - Abstraction means to hide the unwanted data from the user and so important data only...

        // Using constructor...

        Student s1 = new Student("Ken Ji");
        System.out.println(s1.name);

        // Types of Constructor:
        
        // 1. Non-parameterized. - look down in the code..
        // 2. Parameterized. - this also pls 
        // 3. Copy Constructor.
        // Student s2 = new Student(s1); This is called copy Constructor but for
        // understanding. This also pls look down...


        // Creating object for Inheritence..

        JellyFish myFish = new JellyFish();
        myFish.faviroteFish();

        // 1. Single Level Inheritence means that only one parent and one child.. 
        // 2. Multi Level Inheritence means that one parent and two or more childs. ex: Animal -> Fish -> JellyFish and so on..
        // 3. Hierarchial Inheritence means that one parent and all the childs are attached to to same parent...

        // Hierarchial Inheritence example:

        Animal newAnimal = new Animal();
        newAnimal.getClass();

        // 4.Hybird Inheritence means that two or more parent and one or more child attached to the both parents...

        // Abstraction can be implemented by Abstract class(covers only 50% - 80%) and Interfaces(covers 100%)
        // example (Abstract class)..
        
        Horse n = new Horse();
        n.eat();
        n.walks();

        Chicken chicken = new Chicken();
        chicken.eat();
        chicken.walks();

        // example (Interface)...

        Queen u = new Queen();
        u.moves();

        Hook h = new Hook();
        h.moves();

        pown p = new pown();
        p.moves();

    }
}

class BankAccount{
    public String UserName;
    // private String password;
    public void setPassword(String pwd){
        // password = pwd;
    }
}

class Pen{
    private String color;
    private int tip;

    void setColor(String newcolor){
        this.color = newcolor;
    }

    void setTip(int newtip){
        this.tip = newtip;
    }

    // Using Getters and Setters...

    String getColor(){
        return this.color;
    }

    int getTip(){
        return this.tip;
    }
}

// Constructor...

class Student{
    String name;
    int Roll;

    Student(Student s1){
        this.name = s1.name;
        this.Roll = s1.Roll;
    }
    Student(){ // This is non-parameterized constructor..
        System.out.println("This is new one constructor..");
    }
    Student(String name){ // This is parameterized constructor..
        this.name = name;
    }

}

// Inheritence starts...

class MarineAnimal{
    String color;

    void eats(){
        System.out.println("Eating now...");
    }
    void breathe(){
        System.out.println("Breathing now...");
    }
}

class Fish extends MarineAnimal{
    int fins;

    void swim(){
        System.out.println("Swimming right now...");
    }
}
class JellyFish extends Fish{
    int fish;

    void faviroteFish(){
        System.out.println("My favorite Fish Jelly Fish. Did you know that a japanese JellyFish can live forever...");
    }
}

// Hierarchial Inheritence...

class Animal{
    String color;
    int size;

    void not(){
        System.out.println("Here is nothing");
    }

}

class Human extends Animal{
    int size;
    int IQ;

    void hello(){
        System.out.println("Hello");
    }
}
class WildAnimals extends Animal{
    String color;
    int size;

    void wildAnimals(){
        System.out.println("This is second allocator of the class Animal...");
    }
}

// Abstract class starts Here...

abstract class An{
    
    void eat(){
        System.out.println("Eating right now...");
    }

    abstract void walks();

}

class Horse extends An{
    void walks(){
        System.out.println("Walks on four legs...");
    }
}

class Chicken extends An{
    void walks(){
        System.out.println("Walks on two legs...");
    }
}

// Abstract Interface starts here...

interface WalkOnWater{
    void moves();
}

class Queen implements WalkOnWater{
    public void moves(){
        System.out.println("up, down, left, right, diagonaly(directions)...");
    }
}

class pown implements WalkOnWater{
    public void moves(){
        System.out.println("up, left, right...");
    }
}

class Hook implements WalkOnWater{
    public void moves(){
        System.out.println("up, down, left, right...");
    }
}
