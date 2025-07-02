public class ArrayUtils {

    // Prints all elements in the array
    public static void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Calculates the sum of all elements in the array
    public static int calculateSum(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum;
    }

    // Finds the largest element in the array
    public static int findMax(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    // Finds the smallest element in the array
    public static int findMin(int[] nums) {
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    // Reverses the array in-place
    public static void reverseArray(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }

    // Searches for a value in the array and prints its index if found
    public static void searchValue(int[] nums, int target) {
        boolean found = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                System.out.println("target value found at index: " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println(false);
        }
    }

    // Calculates the average of all elements in the array
    public static double calculateAverage(int[] nums) {
        int sum = calculateSum(nums);
        return (double) sum / nums.length;
    }

    // Counts even and odd numbers in the array
    public static void countEvenOdd(int[] nums) {
        int evenCount = 0;
        int oddCount = 0;
        for (int num : nums) {
            if (num % 2 == 0) {
                evenCount++;
            } else if (num % 2 == 1) {
                oddCount++;
            }
        }
        System.out.println("Even Numbers: " + evenCount + "\nOdd Numbers: " + oddCount);
    }

    // Sorts the array in ascending order using bubble sort
    public static void bubbleSort(int[] nums) {
        boolean swapped;
        for (int i = 0; i < nums.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    // Swaps nums[j] and nums[j+1]
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    swapped = true;
                }
            }
            // If no two elements were swapped during the inner loop, break the loop
            if (!swapped) {
                break;
            }
        }
    }

    // Finds all occurrences of a target value and prints their indices
    public static void findOccurrences(int[] nums, int target) {
        boolean found = false;
        System.out.print("target value found at index: ");
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                System.out.print(i + " ");
                found = true;
            }
        }
        if (!found) {
            System.out.println("target value not found");
        } else {
            System.out.println();
        }
    }
}
