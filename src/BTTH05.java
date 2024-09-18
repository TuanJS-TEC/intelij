import java.util.Scanner;

public class BTTH05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();

        while (T-- > 0) {
            String N = sc.nextLine();
            if (kiemTra(N)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    public static boolean kiemTra(String N) {
        for (int i = 0; i < N.length() - 1; i++) {
            int digit1 = N.charAt(i) - '0';
            int digit2 = N.charAt(i + 1) - '0';

            if (Math.abs(digit1 - digit2) != 1) {
                return false;
            }
        }
        return true;
    }
}