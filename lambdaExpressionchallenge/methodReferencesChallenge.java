import java.util.ArrayList;
import java.util.List;
import java.util.function.*;

class methodReferencesChallenge{ 

    static String getReverseName(String name){
        return StringBuilder(name).reverse().toString();
    }

    public static void main(String[] args) {
        
        List< UnaryOperator<String> > operators = new ArrayList<>(); 


        operators.add(
            new UnaryOperator<String>() {
                @Override
                public String apply (String s){
                    return s.toUpperCase(); 
                }
            },
            new UnaryOperator<String>() {
                @Override
                public String apply (String s){
                    return s +" " +getReverseName(s);                     
                }
            }
        );


        operators.forEach(s -> { 

            List<String> names = new ArrayList<>(List.of("Bob", "John", "Anna", "Bill"));

            names.forEach( n -> {
                
                System.out.println(s.apply(n));
            });

        });


    }
}