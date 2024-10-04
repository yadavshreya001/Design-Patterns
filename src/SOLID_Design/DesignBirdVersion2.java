package SOLID_Design;
//use LSP for bettersolution
abstract class Bird2{
    String name;
    String color;
    abstract void eat();
}

abstract class flyBirdSound extends Bird2{
    abstract void fly();
    abstract void makeSound();
}
abstract class flyBirdNotSound extends Bird2{
    abstract void fly();
}
abstract class notflyBirdSound extends Bird2{
    abstract void fly();
    abstract void makeSound();
}
abstract class notflyBirdNotSound extends Bird2{
    abstract void fly();
}




public class DesignBirdVersion2 {
    public static void main(String[] args) {


    }
}
