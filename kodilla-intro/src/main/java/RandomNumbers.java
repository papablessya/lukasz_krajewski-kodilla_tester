import java.util.Random;
public class RandomNumbers {

    int number;

    public static void main(String[] args) {

        RandomNumbers[] randomNumbers = new RandomNumbers[30];
        int[] numbers = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30};

        int i = 0;
        while (i <= 30) {
            System.out.println(i);
            i++;
        }
    }

    public int getCountOfRandomNumbers(int max) {
        Random random = new Random();
        {
        int result = 0;
        int sum = 0;
        while (sum < max) {
            int temp = random.nextInt(30);
            sum = sum + temp;
            result++;
        }
        return result;
    }
}
}



