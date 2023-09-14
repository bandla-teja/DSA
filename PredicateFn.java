import java.util.function.Predicate;

public class PredicateFn {

    public static void main(String[] args) {
        Predicate<Integer> p1 = (val) -> {
            if (val % 2 == 0) {
                return true;
            }
            return false;
        };

        Predicate<Integer> p2 = (val) -> {
            if(val == 10){
                return true;
            }
            return false;
        };

        System.out.println(p1.and(p2).test(4));
    }
}
