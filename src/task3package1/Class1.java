package task3package1;


//Package-private is a default access to a given class, method or property. It means that all members are visible
// within the same package but aren't accessible from other packages.
public class Class1 {
        int privateInt = 4;
        public int publicInt = 2;
        String privateString;

        static void privateMethod(){
        System.out.println("Private method");
    }
}
