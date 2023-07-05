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


// Insert at a specific position 
class Insert {
	static void insertElement(int arr[], int n, int x,
							int pos)
	{
		for (int i = n - 1; i >= pos; i--)
			arr[i + 1] = arr[i];
		arr[pos] = x;
	}
	public static void main(String[] args)
	{
		int arr[] = new int[15];
		arr[0] = 2;
		arr[1] = 4;
		arr[2] = 1;
		arr[3] = 8;
		arr[4] = 5;
		int n = 5;
		int x = 10, pos = 2;

		System.out.print("Before Insertion: ");
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");

		insertElement(arr, n, x, pos);
		n += 1;

		System.out.print("\n\nAfter Insertion: ");
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
	}
}


// Delete from an unsorted array
class UnsortedArray{
    static int findElement(int arr[],int key,int n){
        for(int i=0;i<n;i++)
            if(arr[i]==key)
            return i;
        return -1;
     }
    static int deleteElement(int arr[],int key,int n){
         int result = findElement(arr,key,n);
         if(result==-1)
             {
               System.out.println("Element not found.") ;
               return n;
             }
             
             for(int i=result;i<n-1;i++)
                 arr[i]=arr[i+1];
                 return n-1;
             }
         
    public static void main(String args[]){
        int arr[] = {2,6,5,1,9};
        int key = 1;
        int n = arr.length;
        System.out.println("Array before deletion:");
        for(int i=0;i<n;i++)
            System.out.println(arr[i]+ " ");
            
         n=deleteElement(arr,key,n);
            
         System.out.println("Array after deletion:");
        for(int i=0;i<n;i++)
            System.out.println(arr[i]+ " ");
        }
    }
