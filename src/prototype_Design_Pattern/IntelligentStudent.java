package prototype_Design_Pattern;

public class IntelligentStudent extends Student{
    private int iq;

    //default constructor
    public IntelligentStudent(){
        super();
    }
    //copy constructor
    public IntelligentStudent(IntelligentStudent intelligentStudent){
        super(intelligentStudent);
        this.iq = intelligentStudent.iq;
    }

    @Override
    public IntelligentStudent clone(){
        return new IntelligentStudent(this);
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }


}
