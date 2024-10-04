package SOLID_Design;

class Student{
    //String name;
    int age;
    int weight;

    Student(int x , int y){
        this.weight = x;
        this.age = y;
    }

    /*
    void setName(String name){
        this.name = name;
    }
     String getName(){
        return name;
     }

     void setAge(int age){
        this.age = age;
     }

     int getAge(){
        return age;
     }
     */

}


public class ClassNObject {
    public static void main(String[] args) {
        Student st1 = new Student(70 , 25);
        st1.weight = 90;

//        System.out.println(st1);
//        System.out.println(st1.weight);
//        System.out.println(st1.age);
//        Student st2 = st1;
//        System.out.println(st1);
//        System.out.println(st2);
//        System.out.println(st2.weight);
//        System.out.println(st1.weight);

           Student st3 = null; //note: storing null as an address is valid
           System.out.println(st3);
            System.out.println(st3.weight);
        // throw nullPointerException bcz we are accessing the data at null

//        st.setAge(20);
//        st.setName("Ram");
//        System.out.println("Name is: " + st.getAge());
//        System.out.println("Age is: " + st.getName());
    }
}
