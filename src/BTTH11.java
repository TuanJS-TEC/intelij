import java.math.BigInteger;
import java.util.Scanner;

public class BTTH11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine(); // Đọc bỏ dòng trống sau khi nhập T

        while (T-- > 0) {
            String nStr = sc.nextLine();
            if (isBeautifulNumber(nStr)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    // Hàm kiểm tra số đẹp
    public static boolean isBeautifulNumber(String nStr) {
        // Kiểm tra độ dài và ký tự đầu cuối
        int len = nStr.length();
        if (len == 0 || nStr.charAt(0) != '8' || nStr.charAt(len - 1) != '8') {
            return false;
        }

        // Tính tổng các chữ số
        BigInteger n = new BigInteger(nStr);
        int digitSum = 0;
        while (n.compareTo(BigInteger.ZERO) > 0) {
            digitSum += n.mod(BigInteger.TEN).intValue();
            n = n.divide(BigInteger.TEN);
        }

        // Kiểm tra tổng chữ số có chia hết cho 10 không
        return digitSum % 10 == 0;
    }
}