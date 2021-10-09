package PART_V_fileHnadling.III_fileTransfer;//import java.io.*;

//public class DataTransfer
//{
//    public static void main(String[] args)
//    {
//
//        try (FileInputStream sourceStream = new FileInputStream("G:\\Other computers\\My Laptop\\college document\\0 SEM 3\\CE 251 JAVA\\Java-practicals\\5_3_data_transfer\\src\\sourcefile.txt");
//             FileOutputStream targetStream = new FileOutputStream("G:\\Other computers\\My Laptop\\college document\\0 SEM 3\\CE 251 JAVA\\Java-practicals\\5_3_data_transfer\\src\\targetfile.txt")) {
//
//            // Reading source file and writing content to target
//            // file byte by byte
//            int temp;
//            while ((temp = sourceStream.read()) != -1)
//                targetStream.write((byte) temp);
//            System.out.println("Abs path: "+ targetStream.getFD() );
//        }
//        catch(IOException e){
//            System.out.println("can't open file");
//        }
//        finally{
//            System.out.println("Created by: 20CE155 ADNAN VAHORA");
//        }
//    }
//}



import java.io.*;
import java.util.*;
/**
 *  Write a program to transfer data from one file to another file so that if the destination file does not exist, it is created
 * @author 20CE155 ADNAN VAHORA
 * @see <a href="https://www.geeksforgeeks.org/character-stream-vs-byte-stream-java/">Reference form GFG</a>
 * @see <a href="https://www.geeksforgeeks.org/different-ways-to-copy-content-from-one-file-to-another-file-in-java/">Another reference</a>
 */
public class CopyFromFileaToFileb {

    public static void copyContent(File a, File b)
            throws Exception {

        try (FileInputStream in = new FileInputStream(a); FileOutputStream out = new FileOutputStream(b)) {

            int n;

            // read() function to read the
            // byte of data
            while ((n = in.read()) != -1) {
                // write() function to write
                // the byte of data
                out.write(n);
            }
        }
        // close() function to close the
        // stream
        // close() function to close
        // the stream
        System.out.println("File Copied");
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        // get the source file name
        System.out.println(
                "Enter the source filename from where you have to read/copy :");
        String a = sc.nextLine();

        // source file
        File x = new File(a);

        // get the destination file name
        System.out.println(
                "Enter the destination filename where you have to write/paste :");
        String b = sc.nextLine();

        // destination file
        File y = new File(b);

        // method called to copy the
        // contents from x to y
        copyContent(x, y);
    }
}
