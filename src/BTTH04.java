import java.util.Scanner;

public class BTTH04 {

    public static long gcd(long a, long b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static long lcm(long a, long b) {
        return (a * b) / gcd(a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();

            long ucln = gcd(a, b);
            long bcnn = lcm(a, b);

            System.out.println(bcnn + " " + ucln);
        }
    }
}