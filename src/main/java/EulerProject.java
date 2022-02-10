import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.lang.Math;

public class EulerProject {
//    List<Integer> numList = new ArrayList<>();

//    public int Fib(int n) {
//
//        int numList[] = new int[n + 2];
//        if ( n == 1 || n == 0) {
//            return n;
//        }
//        numList[0] = 0;
//        int sum = 0;
//        int n0 = 1;
//        int n1 = 2;
//        while (n0 <= n){
//            if (n0 % 2 == 0) {
//                numList.add(n0);
////                sum += n0;
//                int n2 = n0 + n1;
//                n0 = n1;
//                n1 = n2;
//            }
//        }
//        return numList.stream().reduce(0, Integer::sum);
//    }

    public Integer Euler_1(int firstNum, int lastNum) {
        List<Integer> numList = new ArrayList<>();
        for (int i = firstNum; i < lastNum; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                numList.add(i);
            }
        }
//        System.out.println(firstNum);
//        System.out.println(lastNum);
//        System.out.println(numList);
        return numList.stream().reduce(0, Integer::sum);
    }

    public Integer Euler_2(int lastNum) {
        int sum = 0;
        int x = 1;  // Represents the current Fibonacci number being processed
        int y = 2;  // Represents the next Fibonacci number in the sequence
        while (x <= lastNum) {
            if (x % 2 == 0)
                sum += x;
            int z = x + y;
            x = y;
            y = z;
        }
        return sum;
    }

    public long Euler_3(long num) {
        long x = num;
        while (true) {
            long y = smFac(x);
            if (y < x)
                x /= y;
            else
                return x;
        }
    }

    private static long smFac(long x) {
        if (x <= 1)
            throw new IllegalArgumentException();
        for (long i = 2, end = (long) Math.sqrt(x); i <= end; i++) {
            if (x % i == 0)
                return i;
        }
        return x;
    }

}
