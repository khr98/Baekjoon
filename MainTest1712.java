import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MainTest1712 {
    private static int fixedCost;
    private static int varianceCost;
    private static int noteBookCost;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        fixedCost = Integer.parseInt(st.nextToken());
        varianceCost = Integer.parseInt(st.nextToken());
        noteBookCost = Integer.parseInt(st.nextToken());
        if (fixedCost < 0 || varianceCost < 0 || noteBookCost < 0)
            return;
        if (noteBookCost <= varianceCost) {
            System.out.println("-1");
            return;
        }
        //+1을 하는 이유는 최초로 이득을 보는 구간.
        System.out.println((fixedCost/(noteBookCost-varianceCost))+1);
    }
}
