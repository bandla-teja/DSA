import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPI {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(6);
        list.add(3);
        list.add(5);
        list.add(4);
        list.add(1);
        list.add(2);
        List<Integer> evenList = list.stream().filter(val -> {return val%2 ==0;}).collect(Collectors.toList());
        System.out.println(Arrays.toString(evenList.toArray()));

        List<Integer> mapList = list.stream().map(i -> i*2).collect(Collectors.toList());
        System.out.println(Arrays.toString(mapList.toArray()));

        List<Integer> sortedList = list.stream().sorted().collect(Collectors.toList());
        System.out.println(Arrays.toString(sortedList.toArray()));

        int minVal = list.stream().min((a,b) -> a.compareTo(b)).get();
        System.out.println(minVal);

        int maxVal = list.stream().max((a,b) -> a.compareTo(b)).get();
        System.out.println(maxVal);
    }
}
