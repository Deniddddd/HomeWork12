import java.util.Random;
import  java.util.Arrays;

public class Lottery {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[7];
        int[] array2 = new int[7];
        for (int j = 0; j <array.length; j++) {
            array[j] = random.nextInt(10);
            array2[j] = random.nextInt(10);
        }
        Arrays.sort(array);
        Arrays.sort(array2);
        int sum = 0;
        for (int j = 0; j <7 ; j++) {
            if (array[j] == array2[j]){
                sum++;
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array2));
        System.out.println("Количество совпадений: " + sum);
    }
}
