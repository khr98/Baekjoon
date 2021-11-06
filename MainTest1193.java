import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MainTest1193 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int line = 0;
        int count = 0;
        while (true) {
            for (int i = 0; i < line + 1; i++) {
                count++;
            }
            line++;
            if (count >= N)
                break;
        }
        int sum = 0;
        for (int i = 0; i < line; i++) {
            sum += i;
        }

        int place = N - sum;
        if (line % 2 == 0)
            System.out.println(place + "/" + (line + 1 - place));
        else
            System.out.println((line + 1 - place) + "/" + place);

    }
}
