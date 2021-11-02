import java.util.LinkedList;
import java.util.Scanner;
import java.util.Queue;

public class MainTest2178 {
    private static int visited[][];
    private static int map[][];
    private static int COL;
    private static int ROW;
    private static int[] dx = {1,-1,0,0};
    private static int[] dy = {0,0,1,-1};

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        COL = scanner.nextInt();
        if (COL == 0)
            return;
        ROW = scanner.nextInt();
        map = new int[COL][ROW];
        visited = new int[COL][ROW];
        for(int i = 0; i < COL; i++){
            for(int j = 0; j < ROW; j++){
                map[i][j] = scanner.nextInt();
                visited[i][j] = 0;
            }
        }
        bfs();
        for(int i = 0; i < COL; i++) {
            for (int j = 0; j < ROW; j++) {
                System.out.print(visited[i][j]+" ");
                //visited[i][j] = 0;
            }
            System.out.println();
        }
        System.out.println(map[COL - 1][ROW - 1]);
    }

    static void bfs(){
        Queue<Point> queue = new LinkedList<>();
        queue.add(new Point(0, 0));
        visited[0][0] = 1;

        while (!queue.isEmpty()){
            Point point = queue.poll();
            int x = point.x;
            int y = point.y;
            for(int i = 0; i < 4; i++) {
                int x2 = x + dx[i];
                int y2 = y + dy[i];

                if ((0 <= x2 && x2 < COL) && (0 <= y2 && y2 < ROW)){
                    if (map[x2][y2] == 1 && visited[x2][y2] == 0){
                        queue.add(new Point(x2, y2));
                        visited[x2][y2] = 1;
                        map[x2][y2] = map[x][y] + 1;
                    }
                }
            }
        }

    }

    static class Point{
        int x;
        int y;

        public Point(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
}
