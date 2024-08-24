import java.util.Scanner;

public class J01005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 1; i <= t; i++) {
            double n= sc.nextDouble();
            double h = sc.nextDouble();
            for(int j = 1; j < n; j++) {
                double k=h*Math.sqrt(j/n);
                System.out.printf("%.6f ",k);
            }
            System.out.println();
        }
        sc.close();
    }
}