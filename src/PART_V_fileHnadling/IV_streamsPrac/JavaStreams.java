package PART_V_fileHnadling.IV_streamsPrac;

import java.io.*;

/**
 * WAP to show use of character and byte stream.
 */
public class JavaStreams {
    public static void main(String[] args) {
        String path = "src/PART_V_fileHnadling/IV_streamsPrac/";

        /*
        FileInputStream and FileOutputStream uses byte stream so we can copy and paste any type of raw binary data using it.
         */
        try {
            FileInputStream getData = new FileInputStream(path + "img.png");
            FileOutputStream putData = new FileOutputStream(path + "paste.png");
            byte[] data = new byte[1024];
            int length;
            while ((length = getData.read(data)) > 0) {
                putData.write(data, 0, length);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        /*
        FileReader and FileWriter use character by character transformation of data hence it is efficient while using text files
         */
        FileWriter writeFile = null;
        try {
            FileReader readFile = new FileReader(path + "src.txt");
            writeFile = new FileWriter(path + "des.txt");
            int temp;
            while ((temp = readFile.read()) != -1) {
                System.out.println((char) temp);
                writeFile.write(temp);
            }

        } catch (Exception ignored) {
            ignored.printStackTrace();
        } finally {
            try {
                writeFile.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
