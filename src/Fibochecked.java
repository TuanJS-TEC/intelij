import java.util.Scanner;

public class Fibochecked {
    static long[] arr= new long[100];//Tao mang luu cac gia tri theo thu tu tu 0

    public static boolean fibo_check(long n){//Ham kiem tra so n co dung la so thuoc day fibo khong
        for(int i=0;i<=92;++i){
            if(arr[i]==n) return true;
        }
        return false;
    }

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long n= sc.nextLong();
            System.out.println(fibo_check(n)?"Yes":"No");//chu y ham --ham(giatri)?"":""--
        }
        sc.close();
    }
}
