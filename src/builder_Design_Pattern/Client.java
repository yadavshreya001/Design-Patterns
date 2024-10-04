package builder_Design_Pattern;

public class Client {
    public static void main(String[] args) {

       /*                     Version 1 of a problem

       This is prone to error
        Student st = new Student ("Shreya", 12,78.8, "MIT", "Academy feb23", 23, 2022, 23414235);
        */

   /*                       Version 3 of a problem

        Map<String, Object> properties = new HashMap<>();
        properties.put("name", "shreya");
        properties.put("age", 20);
        Student st = new Student(properties);
*/

/*                              Version 4 of a problem

        Builder builder = new Builder();
        builder.setName("Shreya");
        builder.setAge(23);
        Student st = new Student(builder);
*/

/*                          Version 5 of a problem

        Builder builder = Student.getBuilder();
        builder.setName("Shreya");
        builder.setAge(23);
        Student st = new Student(builder);
        Student build = builder.build();

 */

//                            Version 6 of a problem
//   we go to the setters of the builder and make the return type as a builder object
// still someone can write Student st = new Student(builder);
// to avoid this make constructor as private
        Student student = Student.getBuilder()
                .setName("Shreya")
                .setPsp(93)
                .build();

//   The moment we will make version 6 constructor as private this below will throw error
//        Student st = new Student(builder);
        






    }
}
