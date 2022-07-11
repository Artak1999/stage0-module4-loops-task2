package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int factorial = 1;
        int i = 2;
        int count = 1;
        while(count <= printToInclusive){
            System.out.println(factorial);
            factorial *= i;
            i++;
            count++;
        }
    }
}
