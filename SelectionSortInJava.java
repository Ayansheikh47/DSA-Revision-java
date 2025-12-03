public class SelectionSortInJava {
    

    
    public static void main(String[] args) {
        

        int nums[] = {2,9,6,3,1,7};
        int size=nums.length;
        int temp=0;
        int minindex=-1;


        System.out.println("Before sorting");
        for(int num : nums){
            System.out.print(num+ " ");
        }

        System.out.println("\nThe process of Selection sort");

        for(int i=0;i<size-1;i++){

            //2'9'6'3'1'7
            minindex=i;

            for(int j=i+1;j<size;j++){

                if (nums[minindex] > nums[j])
                    minindex=j;
                }

                temp=nums[minindex];
                nums[minindex]=nums[i];
                nums[i]=temp;       
                
                System.out.println();
            
            for(int num : nums){
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
