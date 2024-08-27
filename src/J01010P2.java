import java.util.Scanner;

public class J01010P2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            String n=sc.nextLine();
            String ans="";
            for(int i =0;i<n.length();i++){
                char x=n.charAt(i);
                if(x=='0'||x=='8'||x=='9') ans+="0";
                else if(x=='1') ans+="1";
                else {
                    System.out.print("INVALID");
                    break;
                }
            }
            int start;
            for(start=0;start<=ans.length();++start){
                    if(ans.charAt(start)!='0') break;
            }
//            if(start==ans.length()&&ans.charAt(ans.length()-1)=='0') System.out.println("INVALID");
            if(start==ans.length()&&ans.charAt(ans.length()-1)=='0'){
                System.out.println("INVALID");
            }else{
                System.out.println(ans);
            }
        }
    }
}