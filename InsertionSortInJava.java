public class InsertionSortInJava {

    public static void main(String[] args) {
        
        int arr[] = {9,1,4,3,7,6,10,2};

        System.out.println("Before sorting");
        for(int num: arr){
            System.out.print(num + " ");
        }
        System.out.println();

        for(int i=1;i<arr.length;i++){

            int key = arr[i];
            int j= i-1;

            while(j>=0 && arr[j] > key){

                arr[j+1]=arr[j];
                j--;
            }

            arr[j+1]=key;
        }

        System.out.println("\nAfter sorting");
        for(int num: arr){
            System.out.print(num + " ");
        }


    }
}