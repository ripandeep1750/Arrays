//SEARCHING
class UnsortedArray{
    static int SearchElement(int arr[],int N,int key){
        for(int i=0;i<N;i++){
            if (arr[i]==key)
            return i;
        }
        return -1;
    }
    
    public static void main(String args[]){
        int arr[] = {2,6,4,8,1};
        int key = 8;
        int N=arr.length;
        int position = SearchElement(arr,N,key);
        if(position == -1)
        System.out.println("Element not present in unsorted array.");
        else
        System.out.println("Element present in unsorted array at :" + (position+1));
        }
}

//INSERTION AT END
class UnsortedArray{
    static int InsertEnd(int arr[],int key, int N, int capacity){
        if(N>=capacity)
        return N;
        arr[N]=key;
        return (N+1);
    }
    public static void main(String args[]){
        int arr[] = new int[10];
        arr[0]=3;
        arr[1]=6;
        arr[2]=9;
        arr[3]=2;
        arr[4]=4;
        int N = 5;
        int key = 1;
        int capacity = 10;
        
        System.out.println("Before insertion: ");
        for(int i=0;i<N;i++){
        System.out.println(arr[i] +" ");
        }
        int result = InsertEnd(arr,key,N,capacity);
         System.out.println("After insertion: ");
        for(int i=0;i<result;i++){
        System.out.println(arr[i] +" ");
        }
        }
}
