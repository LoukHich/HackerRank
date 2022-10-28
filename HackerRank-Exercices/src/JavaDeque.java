import java.util.*;

public class JavaDeque {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque deque = new ArrayDeque();
        int n = in.nextInt();
        int m = in.nextInt();
        int x =n;
        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            deque.add(num);
        }

        while(deque.size()>=m){
            List set = new ArrayList();
            Iterator itr = deque.iterator();
            for(int j=0;j<3;j++){
                set.add(itr.next());
            }
            System.out.println(set);
            deque.removeFirst();
        }


    }
}
