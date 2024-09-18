import java.util.*;

public class BTTH08
{
    static int n, k;
    static int cnt = 0;

    static void Try(int i, String s)
    {
        if (s.length() == k)
        {
            System.out.print(s + " ");
            ++cnt;
            return;
        }
        for (int j = i; j <= n; ++j)
            Try(j + 1, s + Integer.toString(j));
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        Try(1, "");
        System.out.println();
        System.out.println("Tong cong co " + cnt + " to hop");
    }
}
//import java.util.Scanner;
//
//public class BTTH08 {
//
//    private static int N, K;
//    private static int[] X;
//    private static int count = 0;
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        N = sc.nextInt();
//        K = sc.nextInt();
//        X = new int[K + 1];
//
//        backtrack(1);
//
//        System.out.println("Tong cong co " + count + " to hop");
//    }
//
//    private static void backtrack(int i) {
//        for (int j = X[i - 1] + 1; j <= N - K + i; j++) {
//            X[i] = j;
//            if (i == K) {
//                printCombination();
//                count++;
//            } else {
//                backtrack(i + 1);
//            }
//        }
//    }
//
//    private static void printCombination() {
//        for (int i = 1; i <= K; i++) {
//            System.out.print(X[i]);
//        }
//        System.out.print(" ");
//    }
//}