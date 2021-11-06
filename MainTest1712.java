import java.util.Scanner;

public class MainTest1712 {
    private static int fixedCost;
    private static int varianceCost;
    private static int noteBookCost;

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        fixedCost = scanner.nextInt();
        varianceCost = scanner.nextInt();
        noteBookCost = scanner.nextInt();
        if (fixedCost < 0 || varianceCost < 0 || noteBookCost < 0)
            return;
        if (noteBookCost < varianceCost) {
            System.out.println("-1");
            return;
        }

        System.out.println((fixedCost/(noteBookCost-varianceCost))+1);
    }
}
