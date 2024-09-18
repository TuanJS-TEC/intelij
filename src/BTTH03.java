import java.math.BigInteger;
import java.util.Scanner;

public class BTTH03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            BigInteger n = sc.nextBigInteger();
            if (isFibonacci(n)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }


    public static boolean isFibonacci(BigInteger n) {

        if (n.equals(BigInteger.ZERO) || n.equals(BigInteger.ONE)) {
            return true;
        }


        BigInteger a = BigInteger.ZERO;
        BigInteger b = BigInteger.ONE;
        BigInteger c = a.add(b);

        while (c.compareTo(n) <= 0) {

            if (c.equals(n)) {
                return true;
            }

            a = b;
            b = c;
            c = a.add(b);
        }

        return false;
    }
}