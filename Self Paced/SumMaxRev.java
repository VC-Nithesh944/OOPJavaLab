
import java.util.Scanner;

public class SumMaxRev {
    public static void main(String[] args) {
        System.out.print("Enter the size of array: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int arr[] = new int [n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0 ; i < arr.length; i++){
            System.out.print(String.format("Enter the %d element : ",(i+1)));
            arr[i] = input.nextInt();
        }

        System.out.print("The elements of the array are: ");
        for (int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int sum = 0 ; 
        int max = arr[arr.length-1] ;
        int revarr[] = new int[arr.length];

        for (int i = arr.length-1; i>=0;i--){
            sum += arr[i];
            if (max<arr[i])
                max = arr[i];
            revarr[arr.length-i-1] = arr[i];
        }

        System.out.print("The sum of all elements of the array is : "+ sum+"\n");
        System.out.print("The max element in the array is : "+max+"\n");
        System.out.print("The element of the rev array is: ");
        for (int i = 0 ; i<revarr.length; i++){
            System.out.print(revarr[i] + " ");
        }
        System.out.println();
    }
}
