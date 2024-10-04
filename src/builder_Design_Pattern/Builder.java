

package builder_Design_Pattern;

public class Builder {
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




