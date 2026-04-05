package Arrays;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {

        int[] my_array1 = {1789, 2035, 1899, 1456, 2013};

        System.out.println("Original array: " + Arrays.toString(my_array1));

        Arrays.sort(my_array1);
        System.out.println("Sorted array: " + Arrays.toString(my_array1));

        int sum = 0;
        for (int i = 0; i < my_array1.length; i++) {
            sum += my_array1[i];
        }

        double average = (double) sum / my_array1.length;

        System.out.println("Sum of elements: " + sum);
        System.out.println("Average value of elements: " + average);
    }
}