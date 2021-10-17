package PART_III_package_N_interfaces.II_interfaces;

/**
 * default method in an interface PART_III_package_N_interfaces.II_interfaces.IPrinter
 */
public interface IPrinter {
    // TODO: 10/8/2021 implement interface with default methods
    default void print(){
        System.out.println("printed from default method");
    }
}
