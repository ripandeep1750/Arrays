Jagged Array = every row to have a different number of columns.
public class Main{
    public static void main(String args[]){
        int arr[][] = new int [3][];
        arr[0]=new int[2];
        arr[1]=new int[4];
        arr[2]=new int[1];
        //Initialize 
        int count=0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                arr[i][j]=count++;
            }
        }
        //print 
        System.out.println("Array is: ");
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }
    }
}
OUTPUT:- 
Array is: 
0 1 
2 3 4 5 
6 
