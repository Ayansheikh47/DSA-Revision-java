public class LinearSeachAndBinarySearchImplementation{
    public static void main(String[] args) {

        int nums[] = {1,3,5,11,15,18,34,56,78,89,90,123,234,456};
        int target = 456;

        int result1= linearSearch(nums,target);
        int result2 = binarySearch(nums, target);
        int result3= binarySearchmthd2(nums,target,0,nums.length-1);

            if (result3 != -1)
                System.out.println("Element found at index: "+result3);
            else
                System.out.println("Element not found");

    }

    private static int binarySearchmthd2(int[] nums, int target, int left, int right) {
       //uisng the reccursive function here

        if (left <= right) {

            int mid = (left + right) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                return binarySearchmthd2(nums,target,mid+1,right);
            } else
                return binarySearchmthd2(nums,target,left,mid-1);
        }
        return -1;
    }

    public static int linearSearch(int[] nums, int target) {

        int steps =0;

        for (int i=0;i<nums.length ;i++){
            steps++;
            if (nums[i] == target) {
                System.out.println("Steps taken by linear search: " + steps);
                return i;
            }
        }

        System.out.println("Steps taken by linear search: " + steps);
        return -1;
    }



    public static int binarySearch(int[] nums, int target) {


        int left=0;
        int right=nums.length-1;
        int steps=0;

        while (left <= right) {

            steps++;

            int mid = (left + right) / 2;

            if (nums[mid] == target) {

                System.out.println("Steps taken by binary search: " + steps);

                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else
                right = mid - 1;
        }

        System.out.println("Steps taken by binary search: " + steps);
        return -1;

    }



}
