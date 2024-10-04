package SOLID_Design;
//use OCP 

class Bird{
    String name;
    String color;
    String beakType;
    String size;
    int weight;

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void makeSound(){
        if(this.name.equals("Pigeon")){
            System.out.println("The pigeon colour is : " + color + " and sound is: Che che");
        }
        else if(this.name.equals("Crow")){
            System.out.println("The Crow colour is : " + color + " and sound is: kaw kaw");
        }
    }

 }

public class DesignBirdCaseStudy {
    public static void main(String[] args) {
        Bird b1 = new Bird();
        b1.name = "Pigeon";
        b1.setColor("Grey");
        b1.makeSound();

        Bird b2 = new Bird();
        b2.name = "Crow";
        b2.setColor("Black");
        b2.makeSound();

    }
}
