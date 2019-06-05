package class12.w;

import java.util.Arrays;
import java.util.Random;

public class Demo4 {
    public static void main(String[] args) {
        Random r = new Random(1);
        int[] arr = new int[10];
        for (int x = 0; x < 10; x++) {
            arr[x] = r.nextInt(90) + 10;
        }
        for (int a : arr) {
            System.out.print(a + " ");
        }
        Arrays.sort(arr);
        System.out.println("\n排序后的输出:");
        for (int a : arr) {

            System.out.print(a + " ");
        }
    }
}

