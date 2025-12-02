public class BubbleSortInJava {

    public static void main(String[] args) {
        

        int nums[] = {2,9,6,3,1,7};
        int size=nums.length;
        int temp=0;


        System.out.println("Before sorting");
        for(int num : nums){
            System.out.print(num+ " ");
        }

        System.out.println("\nThe process of bubble sort");

        for(int i=0;i<size;i++){

            for(int j=0;j<size-i-1;j++){
                
            if (nums[j]>nums[j+1]) {    
                temp=nums[j];
                nums[j]=nums[j+1];
                nums[j+1]=temp;
            }
        }

        System.out.println();
        for(int num:nums){
            System.out.print(num+ " ");
        }

        }

                System.out.println();
        System.out.println("\nAfter sorting");
        for(int num : nums){
            System.out.print(num+ " ");
        }

    }

    
}
