public class Main {

    public static void main(String[] args) {

        // Initializes string s and charTarget
        String s = "hello world";
        char charTarget = 'o';

        // Initializes an int array with numbers
        int[] nums = {30, 50, 10, 40, 20, 55, 50, 23, 47};
        int target = 20;

        // Prints out the nums array
        System.out.print("Original Array : ");
        ArrayUtils.printArray(nums);

        // Calculates the sum of all nums in the array and prints it
        int sum = ArrayUtils.calculateSum(nums);
        System.out.println("sum: " + sum);

        // Finds the largest element in the array
        int max = ArrayUtils.findMax(nums);
        System.out.println("max: " + max);

        // Finds the smallest element in the array
        int min = ArrayUtils.findMin(nums);
        System.out.println("min: " + min);

        // Reverses the array
        ArrayUtils.reverseArray(nums);
        System.out.print("Reversed Array: ");
        ArrayUtils.printArray(nums);

        // Searches for a value in the array, returns true if it exists, else returns false
        ArrayUtils.searchValue(nums, target);

        // Calculates the average of all elements in the array
        double average = ArrayUtils.calculateAverage(nums);
        System.out.println("average value: " + average);

        // Counts even and odd numbers in the array
        ArrayUtils.countEvenOdd(nums);

        // Sorts the array in ascending order using bubble sort
        ArrayUtils.bubbleSort(nums);
        System.out.print("Sorted Array: ");
        ArrayUtils.printArray(nums);

        // Finds occurrence of target and prints out indices
        ArrayUtils.findOccurrences(nums, target);

        // Finds the position of the specific character in a string
        System.out.print("Character found at: " + StringUtils.findChar(s, charTarget));
    }
}
