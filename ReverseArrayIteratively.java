public class RevArrayIteratively{
    static void reverseArray(int arr[], int start, int end){
        int temp;
        while(start < end){
        temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        start++;
        end--;
    }
    }
    
    static void printArray(int arr[], int size){
        for(int x=0;x<size;x++)
            System.out.print(arr[x] + " ");
         System.out.println();
    }
    
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5};
        System.out.println("Array before reverse-");
        printArray(arr,5);
        reverseArray(arr,0,4);
        System.out.println("Array after reverse-");
        printArray(arr,5);
    }
}
