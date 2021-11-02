import java.util.Scanner;

public class Main1712 {
    static public void main(String[] args){
        int fixedCost;
        int changeCost;
        int noteBook;
        int count = 1;

        Scanner scanner = new Scanner(System.in);
        fixedCost = scanner.nextInt();
        if (fixedCost == -1) {
            return ;
        }
        else
        {
            changeCost = scanner.nextInt();
            noteBook = scanner.nextInt();
            int totalCost = fixedCost + changeCost;
            while(true) {
                if (totalCost < noteBook * count)
                    break;
                count++;
            }
            System.out.println(count);
        }
    }
}
