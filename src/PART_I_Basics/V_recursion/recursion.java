package PART_I_Basics.V_recursion;


import java.util.Scanner;
/**
 * We have triangle made of blocks. The topmost row has 1 block, the next row down
 * has 2 blocks, the next row has 3 blocks, and so on. Compute recursively (no loops
 * or multiplication) the total number of blocks in such a triangle with the given number
 * of rows.
 * triangle(0) → 0
 * triangle(1) → 1
 * triangle(2) → 3
 */
public class recursion {
    public static void main(String[] args) {
        TriFun t2 = new TriFun();
        System.out.println("Enter the Number of rows : ");
        Scanner sc = new Scanner(System.in);
        int yourInput;
        yourInput = sc.nextInt();
        for (int i=1; i<=yourInput;i++){
            for (int j=1; j<=i;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
        System.out.println("The required number of blocks are "+ t2.triangle(yourInput));
    }
}
