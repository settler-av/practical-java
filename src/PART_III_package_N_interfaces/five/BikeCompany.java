package PART_III_package_N_interfaces.five;

Code
//first package//
        package practical;

public class Calculator {
    public int add(int a, int b){
        System.out.println("Sum of entered numbers:");
        return a+b;
    }
    public static void main(String args[]){

        Calculator obj = new Calculator();
        System.out.println(obj.add(10, 20));
    }

}

//second package//

package Letmecal;
        import practical.Calculator
public class Demo {
    public static void main(String args[]){
        System.out.println("Imported class Calculator from other package 'practical'");
        Calculator obj = new Calculator();
        System.out.println(obj.add(100, 20));
    }

}


