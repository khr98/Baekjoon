//import java.util.PriorityQueue;
//import java.util.Scanner;
//
//public class MainTest4458 {
//    private static int[] dx = {-1, 0, 1, 0};
//    private static int[] dy = {0, -1, 0, 1};
//    private static int MAX = Integer.MAX_VALUE;
//    private static int SIZE;
//    private static int[][] map;
//    private static int[][] distances;
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int count = 1;
//        int result = 0;
//        while (true) {
//            SIZE = scanner.nextInt();
//            if(SIZE == 0)
//                return ;
//            map = new int[SIZE][SIZE];
//            distances = new int[SIZE][SIZE];
//            for (int i = 0; i < SIZE; i++) {
//                for (int j = 0; j < SIZE; j++) {
//                    map[i][j] = scanner.nextInt();
//                    distances[i][j] = MAX;
//                }
//            }
//            result = bfs();
//            System.out.println("Problem " + (count++) + ": " + result);
//        }
//    }
//
//    static int bfs() {
//        PriorityQueue<Point> queue = new PriorityQueue<>();
//        queue.add(new Point(0, 0, map[0][0]));
//        distances[0][0] = map[0][0];
//        while (!queue.isEmpty()) {
//            Point point = queue.poll();
//            int x = point.x;
//            int y = point.y;
//            for (int i = 0; i < 4; i++) {
//                int x2 = x + dx[i];
//                int y2 = y + dy[i];
//                if ((0 <= x2 && x2 < SIZE) && (0 <= y2 && y2 < SIZE)) {
//                    if (distances[x2][y2] > distances[x][y] + map[x2][y2]) {
//                        distances[x2][y2] = distances[x][y] + map[x2][y2];
//                        queue.add(new Point(x2, y2, distances[x2][y2]));
//                    }
//                }
//            }
//        }
//        return distances[SIZE - 1][SIZE - 1];
//    }
//
//    static class Point implements Comparable<Point>{
//        int x;
//        int y;
//        int rupee;
//
//        public Point(int x, int y, int cost) {
//            this.x = x;
//            this.y = y;
//            this.rupee = cost;
//        }
//
//        @Override
//        public int compareTo(Point o) {
//            return rupee - o.rupee; //오름차순 만들기
//        }
//    }
//}