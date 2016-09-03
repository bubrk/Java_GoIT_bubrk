package module3.task1;
/**
 * This is Bird class
 * according to the task, it can fly, sing and inherits other features from Animal
 * */
public class Bird extends Animal{

    public void fly() {
        System.out.println("I am flying");
    }

    public void sing(){
        System.out.println("I am singing");
    }

    public void whoAmI(){
        System.out.println("I am Bird");
    }

}
