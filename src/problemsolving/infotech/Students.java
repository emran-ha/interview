package problemsolving.infotech;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class Students {

    static int lastSt(int n, int k) {
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= n; i++){
            queue.add(i);
        }
        while (queue.size() > 1) {
            int d = k - 1;
            while (d > 0){
                queue.add(queue.remove());
                d--;
            }
            queue.remove();
        }
        return queue.remove();
    }

    public static void main(String[] args) {
        System.out.println(Students.lastSt(6, 2));
    }
}
