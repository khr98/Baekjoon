import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MainTest2869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        int day = (V - B) / (A - B); //정상에 도달하면 미끄러지지않기때문에, down횟수가 up보다 하나 더 적어서 뺌.

        if ((V - B) % (A - B) != 0)
            day++;
        System.out.println(day);
    }
}
