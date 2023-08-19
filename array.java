import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        int n;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of elements in array: ");
        n=s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the elememts: ");
        for(int i=0; i<n; i++){
            a[i]=s.nextInt();
        }
        // to print even elements
        System.out.println("The even elements are: ");
        for(int i=0; i<n; i++){
            if(a[i]%2==0){
                System.out.print(a[i] +" ");
            }
        }
        System.out.println("");
        //to print odd elements
        System.out.println("The odd elements are: ");
        for(int i=0; i<n; i++){
            if(a[i]%2 !=0){
                System.out.print(a[i] +" ");
            }
        }
    }
}

OUTPUT:-
Enter the number of elements in array: 
6
Enter the elememts: 
1
2
3
4
5
6
The even elements are: 
2 4 6 
The odd elements are: 
1 3 5 
