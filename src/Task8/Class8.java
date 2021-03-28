package Task8;

public class Class8 {
    private int age = 0;
    private int salary = 1000;
    private double c = 3.5;
    private double d = 4.5;
    private String str = "My String";

    public int getAge() {
        return age;
    }
    public int getSalary() {
        return salary;
    }
    public double getC() {
        return c;
    }
    public double getD() {
        return d;
    }
    public String getStr() {
        return str;
    }


    public void setAge (int newAge){
        if (newAge > 0 && newAge <= 120){
            age = newAge;
            System.out.println("The age is correct");
        }
        else {
            throw new IllegalArgumentException("The age " + newAge + " is incorrect");
        }

    }
    public void setSalary (int newSalary) {
        if (newSalary >= 1000 && newSalary <= 1200) {
            this.salary = newSalary + 200;
        }
        else if (newSalary > 1200) {
            this.salary = newSalary;
        }
        else {
            System.out.println("You have entered incorrect salary");
        }
    }

    public void setC (double newC){
        c = newC;
    }
    public void setD (double newD){
        d = newD;
    }
    public void setStr (String newStr){
        str = newStr;
    }

}
