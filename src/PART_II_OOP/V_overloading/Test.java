package PART_II_OOP.V_overloading;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("``````````````````````Welcome to Washing machine.````````````````````");
        waterTank tank = new waterTank();
        WashingMachine whirlPool = new WashingMachine();
        Scanner userChoice = new Scanner(System.in);
        /**
         * this is machine menu
         * here user will enter his choice and will run the machine.
         */
        do {
            System.out.println("1.\tPower\t\t" +
                    "2.\tProgram \t\t" +
                    "3.\trestart\t\t");
            System.out.println("Your choice : ");
            int choice = userChoice.nextInt();
            switch (choice) {
                case 1:
                    whirlPool.power();
                    break;
                case 2:
                    whirlPool.program();
                    break;
                case 3:
                    whirlPool = new WashingMachine();
                    break;
            }

        } while (whirlPool.machinePower);
    }


}
