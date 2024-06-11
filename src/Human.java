public class Human {
    // In class if we are creating any variable we call it as property
    // In class if we are creating any functions we call it as behaviour
    String name;
    int age;
    int hands = 2;
    int legs = 2;
    private String fbPass = "fhfhchchc";
    private String bankCredentials = "ggy";



    public Human(){
        // When we are creating object this method got called automatically
        // Constructor has exactly same name as class
        // We use constructor to set the properties for a object
        System.out.println("Hey, Human object got created");
    }

    public Human(String name, int age){
        // We can use constructor to set the property for the project
        this.name = name;
        this.age = age;
    }

    public void giveIntro(){
        System.out.println("Hey I am " + this.name  + " and my age is " + this.age);
    }

    public void walk(){
        System.out.println("hey I am walking");
    }
}
