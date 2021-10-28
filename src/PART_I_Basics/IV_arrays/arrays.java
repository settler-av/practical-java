package PART_I_Basics.IV_arrays;
public class arrays {
    public static void main(String[] args) {
        char[][] response = {{'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};

        char[] key = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
        int[] result = new int[8];
        for (int i = 0; i < 8; i++) {
            int count = 0;
            for (int j = 0; j < 10; j++) {
                if (key[j] == response[i][j])
                    count++;
            }
            result[i] = count;
        }
        for (int i = 0; i < 8; i++) System.out.println("Marks of student "+ (i+1) +": "+ result[i]);
    }
}
