import java.util.*;

public class SecondAndThirdLargestSum {
    public static void main(String[] args) {
        int[] values = {10, 51, 53, 39, 47, 44, 21};
        int sum = findSumOfSecondAndThirdLargest(values);
        System.out.println("Sum of the 2nd and 3rd largest numbers: " + sum);
    }

    public static int findSumOfSecondAndThirdLargest(int[] arr) {
        if (arr.length < 2) {
            System.out.println("Array should have at least 2 elements.");
            return 0;
        }

        Arrays.sort(arr);
        int n = arr.length;
        int secondLargestIndex = n - 2;
        int thirdLargestIndex = n - 3;

        return arr[secondLargestIndex] + arr[thirdLargestIndex];
    }
}
