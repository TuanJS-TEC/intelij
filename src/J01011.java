import java.util.Scanner;
import java.math.BigInteger;

public class J01011{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            BigInteger a=BigInteger.valueOf(sc.nextInt());
            BigInteger b=BigInteger.valueOf(sc.nextInt());
            BigInteger c=a.gcd(b);
            BigInteger d=a.multiply(b).divide(c);
            System.out.println(d+" "+c);
        }
        sc.close();
    }
}