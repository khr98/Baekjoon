import java.util.Scanner;

public class MainTest2292 {
    private static int N;

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int count = 1;
        int range = 2;

        N = scanner.nextInt();
        if (N < 1)
            return;
        if (N == 1){
            System.out.println("1");
            return;
        }
        while (range <= N){
            range += (6 * count);
            count++;
        }
        System.out.println(count);
    }
}
