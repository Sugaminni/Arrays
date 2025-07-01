public class Main {

    public static void main(String[] args) {

        // Practice on Arrays

        // Initializes an int array with numbers
        int[] nums = {10, 20, 30, 40, 50};
        int sum = 0;
        int target = 20;

        // Prints out the num for each digit in the nums array
        for (int num : nums) {
            System.out.println(num);
        }

        // Calculates the sum of all nums in the array and prints it
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        System.out.println("sum: " + sum);

        // Finds the largest element in the array
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        System.out.println("max: " + max);

        //Finds the smallest element in the array
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        System.out.println("min: " + min);

        // Reverses the array
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
        System.out.println("Reversed:");
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

        // Searches for a value in the array, return true if it exists, else return false
        boolean found = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                System.out.println("target value found at index: " + i); // Will return index = 3 since the array was reversed
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println(false);
        }

        // Calculates the average of all elements in the array
        double average = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            average = (double) sum / nums.length; // Changes the value of sum into a double
        }
        System.out.println("average value: " + average);
    }
}
