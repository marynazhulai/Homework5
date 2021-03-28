package Task9;

public class Main {
    // A static field, or static class variable within a class is accessible before an instance of that class
    // is created unlike instance variables. Instance variables (non-static variables) within a class
    // are created when an instance of that class is created at run-time. Hence, non-static variables cannot be
    // accessed until an instance of that class is created. Whereas, static class members can be accessed before
    // that class is created or instantiated.

    //Non-static variables and method:
    public static void main(String[] args) {
        NonStaticClass object = new NonStaticClass();
        double c = object.a + object.b;
        System.out.println(c);
        object.method();
        System.out.println();



        //Static variable and method
        System.out.println(StaticClass.f);
        int h =StaticClass.methodStatic(5);
        System.out.println(h);

    }
}
