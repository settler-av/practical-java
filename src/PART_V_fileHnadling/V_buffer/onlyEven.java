package PART_V_fileHnadling.V_buffer;

import java.io.*;

/**
 * @author Adnan Vahora
 */
public class onlyEven {
    public static File destination = new File("src/PART_V_fileHnadling/V_buffer/Even.txt");
    static int tempInput;

    public static void main(String[] args) {
        for (int i = 0; i < 15; i++) {
            System.out.println("Enter number " + i + ": ");
            getInput();
            writeToFile();
        }
        System.out.println("Data of EVEN.txt");
        printFile();
    }

     static void getInput() {
//        Scanner sc = new Scanner(System.in);
//        tempInput = sc.nextInt();
        tempInput = (int)(Math.random()*10);
        System.out.println(tempInput);
    }

    static void writeToFile() {
        try (BufferedWriter out = new BufferedWriter(new FileWriter(destination,true))) {
            if (tempInput % 2 == 0) {
                out.write(tempInput);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    static void printFile(){
        try (BufferedReader in = new BufferedReader(new FileReader(destination))){
            int temp;
            while((temp = in.read()) != -1 ){
                System.out.print(temp + " ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
