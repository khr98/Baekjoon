import java.util.Scanner;

public class MainTest1193 {
    public static void main(String[] args){
        int x = 1;
        int y = 1;
        int place = 0;
        int sum = 0;
        int line = 0;

        Scanner scanner = new Scanner(System.in);
        place = scanner.nextInt();

        if (place == 1){
            System.out.println(1 + "/" + 1);
            return;
        }

        while(place > sum){
            sum += line;
            line++;
        }
        line -= 1;
        if (place % 2 == 0){
            x = line;
            y = (line + 1) - x;
        }

        else{
            y = line;
            x = (line + 1) - y;
        }

        System.out.println(x+ "/"+y);
    }
}
