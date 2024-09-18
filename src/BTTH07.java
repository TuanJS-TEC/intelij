import java.util.Scanner;
import java.util.Stack;

public class BTTH07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < N; i++) {

            if (stack.isEmpty() || (stack.peek() + A[i]) % 2 == 1) {
                stack.push(A[i]);
            } else {

                stack.pop();
            }
        }

        System.out.println(stack.size());
    }
}

