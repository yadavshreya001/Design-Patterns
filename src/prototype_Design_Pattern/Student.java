package prototype_Design_Pattern;

public class Student implements Prototype<Student> {
    private int age;
    private String name;
    private String batch;
    private double averageBatchPsp;
    private double averageStudentPsp;

    //default constructor
    public Student(){

    }

    //Copy constructor
    public Student(Student student) {
        this.age = student.age;
        this.name = student.name;
        this.batch = student.batch;
        this.averageBatchPsp = student.averageBatchPsp;
        this.averageStudentPsp = student.averageStudentPsp;
    }

    //Getters & Setters
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public double getAverageBatchPsp() {
        return averageBatchPsp;
    }

    public void setAverageBatchPsp(double averageBatchPsp) {
        this.averageBatchPsp = averageBatchPsp;
    }

    public double getAverageStudentPsp() {
        return averageStudentPsp;
    }

    public void setAverageStudentPsp(double averageStudentPsp) {
        this.averageStudentPsp = averageStudentPsp;
    }

    @Override
    public Student clone() {
        return new Student(this);
    }
}
