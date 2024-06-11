import java.util.ArrayList;

public class Main {

    // Abstraction : Functionality is visible to us but from where implementation is coming we don't know


    public static void carRepair(Car c){
        c.run();
    }



    public void fun(){

    }

    public void fun(String s, String m){

    }

    public void fun(String s, Integer a){

    }



    public static class Parent{
        public void sayHii(){
            System.out.println("Hello");

        }
    }

    public static class Child extends Parent{
        // If child is creating a method that is already created in its parent class we call it has method overriding
        public void sayHii(){
            System.out.println("Hello");
        }
    }

















    public static void main(String[] args) {

        // Polymorphism : Having many forms
        // Compile time polymorphism
            // Method overloading : function having same name but different parameters
        // RunTime polymorphism
            // Method overriding : function have same name and same paremeter
        carRepair(new Mercedes());
        Human a = new Human("Somendra", 23);

        BankAccount b = new BankAccount();
        System.out.println(b.getAccName());
        b.setAccBalance(70);
    }
}