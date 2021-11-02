import java.util.Scanner;

public class MainTest2293 {
    private static int SIZE;
    private static int TOTAL;
    private static int[] coins;
    private static int[] d;
    private static int COUNT;

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        SIZE = scanner.nextInt();
        if (SIZE < 1 || SIZE > 100)
            return;
        coins = new int[SIZE];
        TOTAL = scanner.nextInt();
        if (TOTAL < 1 || TOTAL > 10000)
            return;
        d = new int[TOTAL];
        for(int i = 0; i < SIZE; i++){
            coins[i] = scanner.nextInt();
        }
        count();
    }

    static void count() {
        for(int i = 0; i < SIZE; i++){
            for (int j = coins[i]; j <= TOTAL; j++){
               if(j >= coins[i])
                   d[j] += d[j-coins[i]];
            }
        }
        System.out.println(d[TOTAL]);
    }
}
