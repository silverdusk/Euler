import java.util.ArrayList;
import java.util.List;

public class Euler_1 {
    List<Integer> numList = new ArrayList<>();

    public Integer EulerOne(int firstNum, int lastNum) {
        for (int i = firstNum; i < lastNum; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                numList.add(i);
            }
        }
        System.out.println(firstNum);
        System.out.println(lastNum);
        System.out.println(numList);
        return numList.stream().reduce(0, Integer::sum);
    }
}
