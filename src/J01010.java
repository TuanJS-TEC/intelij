import java.util.Scanner;

public static class{
    public static void main(){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            String n=sc.nextLine();
            String ans='';
            for(int i=0;i<n;i++){
                int X=charAt[i];
                if(X=='0'||X=='9'||X=='8') ans+='0';
                else if(X=='1') ans+='1';
                else System.out.println("INVALID");
            }
            int start;
            for(start = 0;start<=length.ans;start++){
                if(ans.charAt[start]!='0') break;
            }
            if(start==length.ans && ans.length()-'1'==0) {
                System.out.println("INVALID");
                else{
                    System.out.println(ans.subtring(start,ans.length));
                }
            } 
            sc.close();

        }
    }
}