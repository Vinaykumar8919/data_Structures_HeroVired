// Given an array of integers and a target sum, find two numbers in the array
// that add up to the target sum.

// Create a class called TwoSum.
// Define a method named twoSum that takes an array of integers (nums) and a
// target sum (target) as parameters and returns an array of two integers.
// Inside the twoSum method, initialize two nested loops. The outer loop will
// iterate from i = 0 to nums.length - 1.
// Inside the outer loop, initialize the inner loop. It will iterate from j = i
// + 1 to nums.length - 1.
// Within the inner loop, check if the sum of nums[i] and nums[j] equals the
// target sum:
// If the sum is equal to the target, return a new array with i and j as
// elements.
// If no pair is found within the loops, throw an IllegalArgumentException with
// an appropriate error message indicating that no two numbers add up to the
// target sum.
// In the main method, create an instance of the TwoSum class.
// Define an array of integers (nums) and assign values to it.
// Define a target sum (target).
// Call the twoSum method with the nums and target as arguments, and store the
// result in an array (result).
// Print the elements of the result array to display the indices of the two
// numbers that add up to the target sum.




public class arrays01 {
    public int [] twoSum(int [] arr, int target) {
        int res[] = {0,0};

        for(int i=0; i<arr.length-1; i++) {
            for(int j=i+1; j<arr.length; j++) {
                if(arr[i]+arr[j]==target) {
                    res[0]=arr[i];
                    res[1]=arr[j];
                    return res;

                }
            }
        }
            throw new IllegalArgumentException("no two numbers add up to the target sum."); 
        

    }
    public static void main(String[] args) {
        arrays01 a = new arrays01();
        int arr[] = {2,4,5,1,9,10,4,14};
        int target = 100;
        try {
            int res[] = a.twoSum(arr, target);
            for(int i=0; i<res.length; i++) {
                System.out.print(res[i]+" ");
            }
        } catch(Exception e) {
            System.out.print(e);
        }
        
        

    }
}