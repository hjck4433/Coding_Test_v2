import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        // 낮은 순자 운선순위
        PriorityQueue<Integer> min = new PriorityQueue<>();
        // 높은 숫자 우선순위
        PriorityQueue<Integer> max = new PriorityQueue<>(Comparator.reverseOrder());
        
        StringBuilder rst = new StringBuilder();
        for (int i = 0; i < N; i++){
            int x = Integer.parseInt(br.readLine());
            
            // max부터 값을 채움
            // max -> min -> max 순으로 채움
            if(max.size() == min.size()){
                max.offer(x);
            }else {
                min.offer(x);
            }
            // 만약 min이 비어있지 않고 max의 가장 큰 값이  min의 가장 작은 값보다
            // 크다면 서로 바꿈
            // ex) max : 7, 2 / min: 3 => max: 3, 2 / min 7
            // 이렇게 하면 max의 첫번째 값이 항상 중간 값 또는 크기가 작은 중간값 성립
            if (!min.isEmpty() && max.peek() > min.peek()) {
                min.offer(max.poll());
                max.offer(min.poll());
            }
            rst.append(max.peek() + "\n");
            
        }
        System.out.println(rst.toString());
    }
}