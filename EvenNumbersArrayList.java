import java.util.ArrayList;
import java.util.List;

public class EvenNumbersArrayList{
    public static void main(String[] args){
        long startTime = System.currentTimeMillis();

        List<Integer> evenNumbers = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            int number = 2 * i;
            evenNumbers.add(number);
            System.out.println("Indeks: " + i + ", Liczba: " + number);}
        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;

        System.out.println("Całkowity czas operacji: " + executionTime + " ms.");}}
