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
        System.out.println(comparingValuesInAnArray(new int[]{4, 5, 5, 5, 5, 15, 10}));
        System.out.println("--------");

        shiftArray(new int[] {1, 2, 3, 4, 5}, 6);
        shiftArray(new int[] {1, 2, 3, 4, 5}, 1);
        shiftArray(new int[] {1, 2, 3, 4, 5}, 2);
        shiftArray(new int[] {1, 2, 3, 4, 5}, 5);
        shiftArray(new int[] {1, 2, 3, 4, 5}, 6);
        shiftArray(new int[] {1, 2, 3, 4, 5}, -1);
        shiftArray(new int[] {1, 2, 3, 4, 5}, -2);
        shiftArray(new int[] {1, 2, 3, 4, 5}, -5);
        shiftArray(new int[] {1, 2, 3, 4, 5}, -6);


    }
    private static void shiftArray(int[] array, int n) {
        int shiftNumber = n % array.length;
        if (shiftNumber < 0) {
            shiftLeft(array, Math.abs(shiftNumber));
        }
        else {
            shiftRight(array, shiftNumber);
        }
        System.out.println(Arrays.toString(array) + "; shiftNumber = " + n);
    }
    private static  void shiftRight(int[] array, int n) {
        for (int i = 0; i < n ; i++) {
            int lastValue = array[array.length - 1];
            for (int j = array.length - 1; j > 0 ; j--) {
                array[j] = array[j - 1];
            }
            array[0] = lastValue;
        }
    }
    private static void shiftLeft(int[] array, int n) {
        for (int i = 0; i < n ; i++) {
            int firstValue = array[0];
            for (int j = 0; j < array.length - 1; j++) {
                array[j] = array[j + 1];
            }
            array[array.length - 1] = firstValue;

        }
    }

    private static boolean comparingValuesInAnArray(int[] maArray) {
        boolean result = false;
        int lefSum = 0;
        int rightSum = sum(maArray, 0, maArray.length);


        for (int i = 0; i < maArray.length; i++) {
            rightSum -= maArray[i];
            lefSum += maArray[i];


            if (lefSum == rightSum) {
                System.out.println("Comon sum = " + lefSum + "; index = " + 1);
                result = true;
                break;
            }
        }
        System.out.println("----------");
        return result;
    }

    private static int sum(int[] maArray, int start, int end) {
        int sum = 0;
        for (int i = start; i < end; i++) {
            sum += maArray[i];
        }
        return sum;

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

    private static int[] customArray(int len, int initialValue) {
        int[] arr = new int[len];
        Arrays.fill(arr, initialValue);
        return arr;
    }

    private static void twoDimensionalArray(int w, int h) {
        int[][] data = new int[w][h];
        int lastIndex = data.length - 1;
        for (int i = 0; i < data.length; i++) {
            data[i][i] = data[i][lastIndex - 1] = 1;
            System.out.println(Arrays.toString(data[i]));
        }
    }


    private static void arrayMultiplication() {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array.length; i++) {
            int value = array[i];
            if (value < 6) {
                array[i] = value * 2;
            }
        }
        System.out.println(Arrays.toString(array));
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
        for (int i = 0; i < nums.length; i++) {
            nums[i] = ((nums[i] == 1) ? 0 : 1);
        }
        System.out.println(Arrays.toString(nums));
    }
}


