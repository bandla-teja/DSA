
interface DoubleInterf{
    int getDoubleOfGiven(int val);
}

interface SumInterf{
    int add(int val1, int val2);
}

public class LamdaExpressions {
    public static void main(String[] args){
        DoubleInterf i = (val) -> {return val*2;};
        int result = i.getDoubleOfGiven(5);
        System.out.println(result);

        DoubleInterf i1 = val -> val*2;
        int res = i1.getDoubleOfGiven(4);
        System.out.println(res);

        SumInterf sum = (val1, val2) -> {return val1+val2;};
        int sumRes = sum.add(2, 7);
        System.out.println(sumRes);
    }
}