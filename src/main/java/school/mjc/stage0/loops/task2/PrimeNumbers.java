package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int n = 1;
        while(n <= printToInclusive){
            int divisibleCount = 0;
            int primeCheckNumber = 2;
            while(primeCheckNumber <= n/2){
                if(n % primeCheckNumber == 0) {
                    divisibleCount++;
                    break;
                }
                primeCheckNumber++;
            }
            if(divisibleCount == 0 && n != 1)
                System.out.println(n);
            n++;
        }
    }
}
