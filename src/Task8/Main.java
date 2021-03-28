package Task8;


public class Main {
    public static void main(String[] args) {
        Class8 myClass = new Class8();
        System.out.println(myClass.getAge());
        System.out.println(myClass.getSalary());
        System.out.println(myClass.getC());
        System.out.println(myClass.getD());
        System.out.println(myClass.getStr());
        System.out.println();

        myClass.setAge(40);
        myClass.setSalary(1100);

        System.out.println(myClass.getAge());
        System.out.println(myClass.getSalary());
        System.out.println(myClass.getC());
        System.out.println(myClass.getD());
        System.out.println(myClass.getStr());

    }
}
