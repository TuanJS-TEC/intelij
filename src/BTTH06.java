import java.util.Scanner;

public class BTTH06{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();

        while(T-->0){
            String expression = sc.nextLine();
            String result = solveExpression(expression);
            System.out.println(result);
        }
    }

    public static String solveExpression(String expression){
        String[] parts = expression.split(" ");

        int numQuestionmarks = countQuestion(parts);


        if(numQuestionMarks == 0 ){
            return expression;
        }
        for(int i = 0 ; i < Math.pow(4, numQuestionmarks) ; i++){
            String filledExpression = fillwQuestionMarks(parts,i);
            if(isValidExpression(filledExpression)){
                return filledExpression;
            }
        }
        return "WRONG PROBLEM";
    }

    public static String fillwQuestionMarks(String[] parts,int combination) {
        String[] operators ={"+","-","*","%","/"};
        String filledExpression = "";
        int questionMarkIndex = 0;

        for(String part : parts){
            String filledPart="";
            for(int i=0;i< part.length();i++){
                if(part.charAt(i)=='?'){
                    int choice = (combination / (int) Math.pow(4, questionMarkIndex))%4;
                    if (i==0 && part.length()>1){
                        filledPart += choice <2 ? operators[choice] : (char) ('0'+choice -2);
                    }
                    else{
                            filledPart += (char) ('0'+choice);
                        }
                    questionMarkIndex++;
                    }else{
                        filledPart += part.charAt(i);
                }
            }
            filledExpression += filledPart;
        }
        return filledExpression.trim();
    }
    public static boolean isValidExpression(String filledExpression){
        try{
            javax.script.ScriptEngineManager Manager = new javax.script.ScriptEngineManager();
            javax.script.ScriptEngine engine = Manager.getEngineByName("JavaScript");
            Object result = engine.eval(filledExpression);

            int numericResult = ((Number) result).intValue();
            return 10<=numericResult && numericResult<=99 ;
        }catch(Exception e){
            return false;
        }
    }
}