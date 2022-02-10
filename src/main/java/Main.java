public class Main {

    public static void main(String[] args) {
        int resultOne = new EulerProject().Euler_1(1, 1000);
        System.out.println("The answer of problem 1 is: " + resultOne);

        int result2 = new EulerProject().Euler_2(4000000);
        System.out.println("The answer of problem 2 is: " + result2);

        long result3 = new EulerProject().Euler_3(600851475143L);
        System.out.println("The answer of problem 3 is: " + result3);
    }
}
