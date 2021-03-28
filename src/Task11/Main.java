package Task11;

import Task1package1.Class;

public class Main {
    public static void main(String[] args) {

        Class10.staticField = 1;
        System.out.println(Class10.staticField);
        Class10.change(2);
        System.out.println("New value is " + Class10.staticField);

        System.out.println();

        Class10 object = new Class10();
        object.dynamicField = 3;
        System.out.println(object.dynamicField);
        object.setDynamicField(4);
        System.out.println("New value is " + object.dynamicField);

    }
}
