
import java.util.*;
import java.util.function.*;
class lambdaExpressionMiniChallenges{ 

    static void chall1(){
        Consumer<String> printTheParts = s -> Arrays.asList(s.split(" ")).forEach(System.out::println);
        printTheParts.accept("dr dre be the name still running this game"); 
    }

    static void chall2and3(){
        UnaryOperator<String> everySecondChar = s -> {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                if(i % 2 == 1)
                    sb.append(s.charAt(i));
            }
            return sb.toString();
        }; 

        System.out.println(everySecondChar.apply("1234567890"));
    }

    
    static String chall4(UnaryOperator<String> unOp, String s){
            return unOp.apply(s);
    }

    static void chall5(){

        System.out.println( 
            chall4( s -> {
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < s.length(); i++) {
                    if(i % 2 == 1)
                        sb.append(s.charAt(i));
                } 
                return sb.toString();
            }, "1234567890")
        );
    }

    static void chall6and7(){
        Supplier<String> iLoveJava = () -> "i love java"; 
        String supplierResult = iLoveJava.get();

        System.out.println(supplierResult);
    }

    public static void main(String[] args) {
        chall6and7();        
    }
    
}