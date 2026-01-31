package Day12;
import java.util.*;

public class E {
    static class Friend {
        int x;
        long c;
        int id;
        Friend(int x, long c, int id) { this.x = x; this.c = c; this.id = id; }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            long k = sc.nextLong();

            int[] boxes = new int[m];
            for (int i = 0; i < m; i++) boxes[i] = sc.nextInt();

            Friend[] friends = new Friend[n];
            long sumY = 0;
            for (int i = 0; i < n; i++) {
                int xi = sc.nextInt();
                long yi = sc.nextLong();
                long zi = sc.nextLong();
                sumY += yi;
                long ci = zi - yi;
                friends[i] = new Friend(xi, ci, i);
            }

            long R = k - sumY;
            if (R < 0) {
                System.out.println(0);
                continue;
            }

            Arrays.sort(boxes);
            Arrays.sort(friends, Comparator.comparingInt(f -> f.x));

            PriorityQueue<Friend> maxHeap = new PriorityQueue<>((a, b) -> Long.compare(b.c, a.c));
            boolean[] usedBox = new boolean[n];
            int idx = 0;
            int boxesUsed = 0;

            for (int b : boxes) {
                while (idx < n && friends[idx].x <= b) {
                    maxHeap.add(friends[idx]);
                    idx++;
                }
                if (!maxHeap.isEmpty()) {
                    Friend chosen = maxHeap.poll();
                    usedBox[chosen.id] = true;
                    boxesUsed++;
                }
            }

            ArrayList<Long> remaining = new ArrayList<>();
            for (Friend f : friends) {
                if (!usedBox[f.id]) remaining.add(f.c);
            }
            Collections.sort(remaining);

            int paidCount = 0;
            for (long cost : remaining) {
                if (cost <= R) {
                    R -= cost;
                    paidCount++;
                } else break;
            }

            System.out.println(boxesUsed + paidCount);
        }
        sc.close();
    }
}

