public class Main {

    public static void main(String[] args) {

        // Practice on Arrays

        // Initializes an int array with numbers
        int[] nums = {30, 50, 10, 40, 20, 55, 50, 23, 47};
        int sum = 0;
        int target = 20;

        // Prints out the num for each digit in the nums array
        System.out.println("Elements in the array: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();

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
        System.out.println("Reversed Array:");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();

        // Searches for a value in the array, return true if it exists, else return false
        boolean found = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                System.out.println("target value found at index: " + i); // Will return index = 4 since the array was reversed
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

        // Counts even and odd numbers
        int evenCount = 0, oddCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                evenCount++;
            } else if (nums[i] % 2 == 1) {
                oddCount++;
            }
        }
        System.out.println("Even Numbers: " + evenCount + " Odd Numbers: " + oddCount);

        // Sorts the array in ascending order using bubble sort
        boolean swapped;
        System.out.println("Sorted Array: ");
        for(int i = 0; i < nums.length - 1; i++) {
            swapped = false;
            for(int j = 0; j < nums.length - i - 1; j++) {
                if(nums[j] >  nums[j + 1]) {
                    // Swaps nums[j] and nums[j+1]
                    int temp =  nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    swapped = true;
                    // If no two elements are swapped during the inner loop, then break
                    if(!swapped) {
                        break;
                    }
                }
            }
        }
        for(int i = 0; i < nums.length; i++) { // Prints out the sorted array
            System.out.print(nums[i] + " ");
        }
        System.out.println();

       // Finds occurrence of target and prints out indices (returns 1 since array was sorted)
        found = false;
        System.out.println("target value found at index: ");
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == target) {
                System.out.print(i + " ");
                found = true; // If the target is found, then it flips the boolean
            }
        }
        if(!found) {
            System.out.println("target value not found");
        }
    }
}
