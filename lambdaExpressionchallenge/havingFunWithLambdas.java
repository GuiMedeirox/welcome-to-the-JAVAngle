public class havingFunWithLambdas {

    @FunctionalInterface
    public interface Operation<T> {
        T operate(T value1, T value2);    
    }

    public static <T> T Operator(Operation<T> operation, T v1, T v2 ){
        T result = operation.operate(v1, v2);
        System.out.println("result: " +result);
        return result; 
    }
    public static void main(String[] args) {
        
        int a1 = Operator( (a, b) -> a + b, 10, 20);
        String s2 = Operator((a, b) -> a.concat(b), "John", "Doe");
        Float f = Operator( (a,b) -> a/b, 10.0f, 5.5f);
    
    }
}
