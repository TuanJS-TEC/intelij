import java.util.Scanner;

public class J01010{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int T= sc.nextInt();
        while(T-->0){
            String n=sc.nextLine();
            String ans="";
            for(int i=0;i<n.length();i++){
                int X= sc.charAt(i);
                if(X=='9'||X=='0'||X=='8') ans+='0';
                else if(X=='1') ans+='1';
                else System.out.println("INVALID");
                break;
            }
            int start;
            for(start = 0;start<ans.length();start++){
                if(ans.charAt(start !='0')) break;
                
            }
        }
    }
}