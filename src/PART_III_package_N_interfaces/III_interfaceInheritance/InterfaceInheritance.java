package PART_III_package_N_interfaces.III_interfaceInheritance;

public class InterfaceInheritance implements P12{
    @Override
    public void methodFromP12() {
        System.out.println("hello from P12");
    }

    @Override
    public void methodFromP1() {
        System.out.println("Hello from P1");
    }

    @Override
    public void methodFromP2() {
        System.out.println("hello from P2");
    }
}
class InterfaceInheritanceDemo{
    public static void main(String[] args) {
        InterfaceInheritance object = new InterfaceInheritance();
        //display constants
        System.out.println("P1 : " + P1.variableFromP1);
        System.out.println("P2 : " + P2.variableFromP2);
        System.out.println("P12 : " + P12.variableFromP12);

        //method display
        object.methodFromP1();
        object.methodFromP2();
        object.methodFromP12();
    }
}
interface P1 {
    void methodFromP1();
    int variableFromP1 = 1;
}
interface P2 {
    void methodFromP2();
    int variableFromP2 = 2;
}
interface P12 extends P1, P2{
    void methodFromP12();
    int variableFromP12 = 12;
}
