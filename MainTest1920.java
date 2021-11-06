import java.util.Scanner;

public class MainTest1920 {
    private static int ARR_SIZE;
    private static int FIND_SIZE;
    private static int find[];
    private static int arr[];
    private static int answer[];

    public static void main(String[] args){
        int key;
        Scanner scanner = new Scanner(System.in);
        if ((ARR_SIZE = scanner.nextInt()) <= 0)
            return ;

        arr = new int[ARR_SIZE];
        for(int i = 0; i < ARR_SIZE; i++)
            arr[i] = scanner.nextInt();

        if ((FIND_SIZE = scanner.nextInt()) <= 0)
            return ;
        find = new int[FIND_SIZE];
        answer = new int[FIND_SIZE];
        for(int i = 0; i < FIND_SIZE; i++)
            find[i] = scanner.nextInt();

        for (int i = 0; i < FIND_SIZE; i++){
            key = find[i];
            for (int j = 0; j < ARR_SIZE; j++){
                if (key == arr[j]) {
                    answer[i] = 1;
                    break;
                }
            }
        }

        for (int i = 0; i < answer.length; i++)
            System.out.println(answer[i]);
    }
}
