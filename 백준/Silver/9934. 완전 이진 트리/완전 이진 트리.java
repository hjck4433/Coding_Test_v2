import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 트리의 노드 갯수
        int K = (int) Math.pow(2, sc.nextInt()) -1;
        
        // 인오더 탐색의 결과로 방문한 노드
        List<Integer> ls = new ArrayList<>();
        for (int i = 0; i < K; i++){
            ls.add(sc.nextInt());
        }
        
        Node root = Main.buildTree(ls, 0, ls.size() -1);
        printTree(root);
    }
    
    static class Node {
        int data;
        Node left;
        Node right;
        
        Node(int data) {this.data = data;}
    }
    
    static Node buildTree(List<Integer> inorder, int start, int end) {
        if (start > end) {
            return null;
        }
        // 중위 탐색 순서로 값이 들어오므로
        // 가운데 값이 root가 됨
        int i = (start + end) / 2;
        Node node = new Node(inorder.get(i)); // root node
        
        // 마지막으로 가장 오른쪽 노드를 생성하고 나면 다시 root로
        // 반환하며 돌아감
        if(start == end) {
            return node;
        }
        // 왼쪽: 시작 ~ 루트 인덱스 -1 사이
        node.left = buildTree(inorder, start, i -1);
        // 오른쪽: 루트 인덱스 + 1 ~ 끝 사이
        node.right = buildTree(inorder, i+1, end);
        return node;
    }
    
    static void printTree(Node root) {
        StringBuilder rst = new StringBuilder();
        
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        
        while(!queue.isEmpty()) {
            int n = queue.size();
            // n = 1 -> 2 -> 4 ->8 leaf를 만날 때까지 늘어남
            // 부모노드의 수만큼 반복하면서 각 부모노드의 
            // 자식노드의 왼, 오 순서대로 큐에 다시 삽입 하면서 큐의 사이즈가 다시 늘어나는 것
            // 출력 삽입의 반복 임
            for(int i = 0; i < n; i++){
                Node node = queue.poll();
                rst.append(node.data + " ");
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }
            // 같은 레벨의 값이 모두 추가 되었으므로 개행
            rst.append("\n");
        }
        
        System.out.println(rst.toString());
    }
}