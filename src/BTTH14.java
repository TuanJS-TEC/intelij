import java.util.Scanner;

public class BTTH14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();

        while (T-- > 0) {
            String S = sc.nextLine();
            if (canBePalindrome(S)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    public static boolean canBePalindrome(String S) {
        int left = 0;
        int right = S.length() - 1;
        int mismatchCount = 0;

        while (left < right) {
            if (S.charAt(left) != S.charAt(right)) {
                mismatchCount++;
                if (mismatchCount > 1) {
                    return false; // More than one mismatch, cannot be made palindromic
                }
            }
            left++;
            right--;
        }

        return true; // Zero or one mismatch, can be made palindromic
    }
}