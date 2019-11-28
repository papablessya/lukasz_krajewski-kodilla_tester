import java.util.Random;
public class RandomNumbers {

    int numbers;

    public static void main(String[] args) {
        Number[] numbers = new Number[30];
        int i = 0;
        while (i <= 30) {
            System.out.println(i);
            i++;
        }
    }
    public int getCountOfRandomNumbers(int max) {
        Random random = new Random();
        int result = 0;
        int sum = 0;
        while (sum < max) {
            int temp = random.nextInt(5000);
            sum = sum + temp;
            result++;
        }
        return result;
    }


}


