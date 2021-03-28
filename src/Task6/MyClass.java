package Task6;

public class MyClass {

    private MyClass() {
    }

    public static MyClass newObject() {
        return new MyClass();
    }

    public void method () {
        System.out.println("New object is created!");
        }

}
