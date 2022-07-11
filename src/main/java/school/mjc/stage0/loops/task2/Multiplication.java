package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int numbers = 0;
        int i = 0;
        while(i <= multiplyByAndToInclusive){
            System.out.println(numbers);
            numbers += 5;
            i++;
        }
    }
}
