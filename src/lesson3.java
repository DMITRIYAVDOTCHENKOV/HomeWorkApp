import java.util.Arrays;

public class lesson3 {
    public static void main(String[] args) {
        integerArray();
        System.out.println("---------");
        autoArrayUpTo100();
        System.out.println("--------");
        arrayMultiplication();
        System.out.println("--------");
        twoDimensionalArray(6, 6);
        System.out.println("--------");
        System.out.println(Arrays.toString(customArray(4, 44)));
        System.out.println("--------");
        minAndMax();
        System.out.println("--------");
        comparingValuesInAnArray();

    }

    private static void comparingValuesInAnArray() {
        int[] myArray = {5, 5, 5, 5, 5, 15, 1};
        int sum = 0;
        int sum1 = 0;
        int a = myArray.length - 1;
        int b = myArray.length - 2;
        for (int i = 0; i < myArray.length - 2; i++) {
            sum += myArray[i];
            sum1 = myArray[a] + myArray[b];
        }
        if (sum == sum1) {
            System.out.println(true);
        } else {
            System.out.println(false);

        }
    }

    private static void minAndMax() {
        int[] minAndMax = new int[]{6, 5, 60, 40, 88, 10, 98, 154};
        int min = minAndMax[0];
        int max = minAndMax[0];

        for (int i = 1; i < minAndMax.length; i++) {
            if (minAndMax[i] < min) {
                min = minAndMax[i];
            } else if (minAndMax[i] > max) {
                max = minAndMax[i];
            }
        }
        System.out.println("Минимальный элемент: " + min);
        System.out.println("аксимальный элемент: " + max);
    }

    static int[] customArray(int len, int initialValue) {
        int[] arr = new int[len];
        Arrays.fill(arr, initialValue);
        return arr;
    }

    private static void twoDimensionalArray(int w, int h) {
        int[][] data = new int[w][h];
        for (int i = 0; i < w; i++)
            for (int j = 0; j < h; j++)
                data[i][j] = 1;

        for (int[] datum : data) {
            for (int i : datum) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }


    private static void arrayMultiplication() {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int j : array) {
            if (j < 6) {
                System.out.println(j * 2);
            }
        }
    }

    private static void autoArrayUpTo100() {
        int[] array100 = new int[100];
        for (int i = 0; i < array100.length; i++) {
            array100[i] = i + 1;
        }
        System.out.println(Arrays.toString(array100));
    }

    private static void integerArray() {
        int[] nums = {1, 1, 0, 0, 1, 1, 0};
        for (int i = 0; i < nums.length; i++) ;
        System.out.println(Arrays.toString(nums));
        System.out.println();
        nums[0] = 0;
        nums[1] = 0;
        nums[2] = 1;
        nums[3] = 1;
        nums[4] = 0;
        nums[5] = 0;
        nums[6] = 1;
        for (int i = 0; i < nums.length; i++) {
        }
        System.out.println(Arrays.toString(nums));
    }
}


