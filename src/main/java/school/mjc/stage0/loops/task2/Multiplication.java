package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int numbers = 0;
        while(numbers <= multiplyByAndToInclusive){
            System.out.println(numbers * numbers);
            numbers ++;
        }
    }
}
