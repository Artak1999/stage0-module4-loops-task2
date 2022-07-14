package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int factorial = 0;
        int i = 2;
        int count = 1;
        if(printToInclusive == 0 || printToInclusive == 1)
            System.out.println(1);
        else {
            while (count <= printToInclusive) {
                if (factorial == 0) {
                    System.out.println(1);
                    factorial = 1;
                }
                System.out.println(factorial);
                factorial *= i;
                i++;
                count++;
            }
        }
    }
}
