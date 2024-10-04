package builder_Design_Pattern;
import java.util.Map;

public class Student {
    private String name;
    private int age;
    private double psp;
    private String universityName;
    private String batch;
    private int id;
    private int gradYear;
    private int phoneNumber;




    /*                      Version 1 of a problem (Creating Single Constructors)

    public Student(String name, int age, double psp, String universityName, String batch, int id, int gradYear, int phoneNumber) {
        this.name = name;
        this.age = age;
        this.psp = psp;
        this.universityName = universityName;
        this.batch = batch;
        this.id = id;
        this.gradYear = gradYear;
        this.phoneNumber = phoneNumber;
     */

      /*                      Version 2 of a problem (Creating Multiple Constructors overloading)

    public Student(String name) {
        this.name = name;
    }

    //  we cant create constructor with same signatures
    public Student (String universityName, int gradYear){
        this.universityName = universityName;
        this.gradYear = gradYear;
    }

    public Student (String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student (String universityName, String batch, int id) {
        this.universityName = universityName;
        this.batch = batch;
        this.id = id;
    }
    */

   /*             Version 3 of a problem (Constructors with HashMap as a parameter)
    public Student (Map<String, Object> map) {

 //        1. we're only setting 2-3 properties

        if (map.containsKey("name")) {
            String studentName = (String) map.get("name");
        }
        if (map.containsKey("age")) {
            int age = (int)(map.get("age"));
        }
        if (map.containsKey("psp")) {
            double psp = (double)(map.get("psp"));
        }
    }
  */

   /*          Version 4 of a problem (Constructors with Custom Datatype class)

 //Creating builder class that is a kind of helper class that will have all the attributes similar to Student class
 //The problem with this approach is facing typecasting errors
  //This is a public constructor
   public Student(Builder builder){
       //can add any validation you want
        this.name = builder.getName();
        this.age = builder.getAge();
        this.psp = builder.getPsp();
        this.universityName = builder.getUniversityName();
       // --- and so on.
   }
    */


//          Version 5 of a problem (Constructors with Enhanced Custom Datatype class)

    public static Builder getBuilder(){
        return new Builder();
    }

//          Version 6 of a problem (Constructors with Enhanced Custom Datatype class)

//  making this constructor as private in version 7 and pasting whole Builder class as an
//  inner class in Student class
    private Student(Builder builder) {
        //can add any validation you want
        this.name = builder.getName();
        this.age = builder.getAge();
        this.psp = builder.getPsp();
        this.universityName = builder.getUniversityName();
        // --- and so on.
    }

    public static class Builder {
            private String name;
            private int age;
            private double psp;
            private String universityName;
            private String batch;
            private int id;
            private int gradYear;
            private int phoneNumber;

            public String getName() {
                return name;
            }

            public Builder setName(String name) {
                this.name = name;
                return this;
            }

            public int getAge() {
                return age;
            }

            public Builder setAge(int age) {
                this.age = age;
                return this;
            }

            public double getPsp() {
                return psp;
            }

            public Builder setPsp(double psp) {
                this.psp = psp;
                return this;
            }

            public String getUniversityName() {
                return universityName;
            }

            public Builder setUniversityName(String universityName) {
                this.universityName = universityName;
                return this;
            }

            public String getBatch() {
                return batch;
            }

            public Builder setBatch(String batch) {
                this.batch = batch;
                return this;
            }

            public int getId() {
                return id;
            }

            public Builder setId(int id) {
                this.id = id;
                return this;
            }

            public int getGradYear() {
                return gradYear;
            }

            public Builder setGradYear(int gradYear) {
                this.gradYear = gradYear;
                return this;
            }

            public int getPhoneNumber() {
                return phoneNumber;
            }

            public Builder setPhoneNumber(int phoneNumber) {
                this.phoneNumber = phoneNumber;
                return this;
            }

            public Student build(){
                // move all validations inside constructor to here maybe.
                return new Student(this);
            }

        /*
        //In Version 5 adding build() method in builder class
        public Student build(){
            // move all validations inside constructor to here maybe.
            return new Student(this);
        }
        */


                //In Version 6 adding build() method in builder class will throw error bcz
                // we made constructor as private
      /*
        public Student build(){
            // move all validations inside constructor to here maybe.
            return new Student(this);
        }
        to resolve this issue, we will take whole Builder class, and
        paste as an inner class in Student class
       */

    }
}



