import java.util.function.Function;

public class FunctionFn {
    public static void main(String[] args) {
        Function<String, Integer> fn1 = (val) -> {
            return val.length();
        };

        System.out.println(fn1.apply("Happy Ending"));

        Function<String, Boolean> fn2 = (val) -> {
            return val.length() >= 5;
        };

        Function<Integer, Integer> fn3 = (val) -> {
            return (val+val);
        };

        Function<Integer, Integer> fn4 = (val) -> {
            return (val+1);
        };

        System.out.println(fn2.apply("Happy Ending"));

        System.out.println(fn3.andThen(fn4).apply(2));
    }
}
