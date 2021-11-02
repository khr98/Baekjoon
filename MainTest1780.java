
import java.awt.*;
import java.io.IOException;
import java.util.Scanner;

public class MainTest1780 {
    private static int[][] array;
    private static int[] count;

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        array = new int[size][size];
        count = new int[3];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        divide(0,0,size);
        for (int i = 0; i < 3; i++)
            System.out.println(count[i]);

    }
    private static boolean checkNum(int start, int end, int size){
        int ret = array[start][end];

        for (int i = start; i < size; i++){
            for (int j = end; j < size; j++){
                if (ret != array[i][j])
                    return false;
            }
        }
        return true;
    }

    private static void divide(int start, int end, int size) {
        if (checkNum(start,end, size))
            count[array[start][end] + 1]++;
        else
        {
            for (int i = 0; i < 3; i++){
                for (int j = 0; j < 3; j++) {
                    divide(start + 3 +i , end + 3+i, size/3);
                }
            }
        }

    }
}
