public abstract class Car {
    // If we have created abstract class then we can't create object of that class
    // Whatever methods are present in the abstract parent class child class need to execute those method
    int wheels = 4;
    int engine;
    int steringwheel;
    int handbreak;

    // Abstract method are those method which are defined but implementation is not done
    // Implementation of these method will be done by someone else
    public abstract void run();
}
