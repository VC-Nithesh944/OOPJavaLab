import java.util.*;

public class Main{
    public static void main(String args[]){
        System.out.print("Enter the number of Element in the array: ");
        Scanner input = new Scanner (System.in);
        int n = input.nextInt();                                          //size of the array
        int[] arr1 = new int[n] ;
        for (int i = 0 ; i<n; i++){
            System.out.print(String.format("Enter the %d element; ",i+1));
            arr1[i] = input.nextInt();
        }
        Arrays.sort(arr1);                                               //Sorting is Compulsory for Binary Search
        print(arr1);
        System.out.println("Enter the element you want to find: ");
        int key = input.nextInt();
        System.out.println("The element is found at index: "+binarySearch(arr1,key));
    }
    public static void print(int[] array){
        System.out.print("The elements of the array are: ");
        for (int i= 0; i<array.length;i++){
            System.out.print(" "+array[i]);
        }
        System.out.println();
    }
    public static int binarySearch(int[] array, int key){
        int low = 0, high = array.length -1;
        while (low < high){
            int mid = (low + high)/2;
            if (array[mid] == key){
                return mid;
            }
            if(array[mid] < key){
                low = mid +1;
            }
            if (array[mid]> key){
                high = mid -1;
            }
        }
        return 0;                                   //returning is must so that the program terminate
    }
}
