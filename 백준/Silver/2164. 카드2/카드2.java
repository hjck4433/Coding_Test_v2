import java.util.*;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < N; i++){
            // 첫 번 째 값이 1이 되도록 함
            queue.add(i + 1); 
        }
        
        int cnt = 1;
        while(queue.size() != 1) {
            int q = queue.poll();
            // 홀수 번째는 버림
            // 짝수 번째의 경우 다시 맨 뒤로 이동
            if (cnt % 2 == 0){
                queue.offer(q);
            }
            cnt++;
        }
        
        System.out.println(queue.peek());
    }
}