package PART_III_package_N_interfaces.II_interfaces;

/**
 * @author 20CE155 ADNAN VAHORA
 * @implNote Create a concrete class to implement both the interfaces. Create 5 objects of the
 * class, store it in Vector and display the result of the vector.
 * @see
 */
public class photoPrintMachine implements IScanner, IPrinter{
    // TODO: 10/8/2021 add obj of class using vectors in PART_II_OOP.II_to_IV_banking.PART_III_package_N_interfaces.II_interfaces.Main class


    @Override
    public void scan() {
        System.out.println("Scan page.");
    }
}
