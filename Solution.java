import java.util.ArrayList;
import java.util.List;

class Solution {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        for(int i=1; i<=numRows; i++){
            if(i == 1){
                List<Integer> lst = new ArrayList<>();
                lst.add(1);
                list.add(lst);
            } else if(i == 2){
                List<Integer> lst = new ArrayList<>();
                lst.add(1);
                lst.add(1);
                list.add(lst);
            } else {
                List<Integer> lst = new ArrayList<>();
                for(int j=0; j<i; j++){
                    if(j == 0){
                        lst.add(1);
                    } else if(j == i-1){
                        lst.add(1);
                    } else {
                        System.out.println(list.get(i-2).get(j)+"+"+list.get(i-2).get(j-1)+" = "+(list.get(i-2).get(j)+list.get(i-2).get(j-1)));
                        lst.add(list.get(i-2).get(j)+list.get(i-2).get(j-1));
                    }
                }
                list.add(lst);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(Integer.parseInt("-1"));
    }
}