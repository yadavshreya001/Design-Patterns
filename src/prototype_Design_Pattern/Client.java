package prototype_Design_Pattern;

public class Client {
    public static void main(String[] args) {
        StudentRegistry studentRegistry = new StudentRegistry();
        fillRegistry(studentRegistry);

        Student shreya = studentRegistry.get("aprilBatch23").clone();
        shreya.setAge(20);
        shreya.setName("Shreya");
        System.out.println("Shreya = " + shreya.getBatch());

        Student ram = studentRegistry.get("aprBatchIntelligentStudent23").clone();
        ram.setAge(40);
        ram.setName("Ram");
        System.out.println("Ram = " + ram.getBatch());


    }

    private static void fillRegistry(StudentRegistry studentRegistry) {
        Student aprBatchStudent = new Student();
        aprBatchStudent.setBatch("Apr 23");
        aprBatchStudent.setAverageBatchPsp(90.0);

        studentRegistry.register("aprilBatch23", aprBatchStudent);

        IntelligentStudent aprBatchIntelligentStudent = new IntelligentStudent();
        aprBatchIntelligentStudent.setIq(180);
        aprBatchIntelligentStudent.setBatch("Apr 23 Intelligent Student");
        aprBatchIntelligentStudent.setAverageBatchPsp(90.0);

        studentRegistry.register("aprBatchIntelligentStudent23", aprBatchIntelligentStudent);
    }
}
