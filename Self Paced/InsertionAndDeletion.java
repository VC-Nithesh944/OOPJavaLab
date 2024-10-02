import java.util.*;

public class InsertionAndDeletion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of Array you want to create: ");
        int n = input.nextInt();

        // Use ArrayList instead of a fixed-size array
        ArrayList<Integer> arr1 = new ArrayList<>();            //Dynamic memory allocation for the array
        System.out.println("Enter the Array elements");
        for (int i = 0; i < n; i++) {
            System.out.print(String.format("Enter the %dth element: ", (i+1)));
            arr1.add(input.nextInt());
        }

        
        while(true){
        System.out.println("1. Insert an element\n2. Delete an element\n3. Print the array\n4. Quit");
        System.out.print("Enter the choice number: ");
        int choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter the element: ");
                    int key = input.nextInt();
                    System.out.print("Enter the insertion position: ");
                    int pos1 = input.nextInt();
                    if (pos1 > 0 && pos1 <= arr1.size() + 1) {
                        insert(arr1, key, pos1);
                    } else {
                        System.out.println("Invalid position.");
                    }
                    break;
                case 2:
                    System.out.print("Enter the deletion position: ");
                    int pos2 = input.nextInt();
                    if (pos2 > 0 && pos2 <= arr1.size()) {
                        System.out.println("The deleted Element is: " + delete(arr1, pos2));
                    } else {
                        System.out.println("Invalid position.");
                    }
                    break;
                case 3:
                    System.out.print("The elements of the array are: ");
                    for (int i = 0; i < arr1.size(); i++) {
                        System.out.print(" " + arr1.get(i));
                    }
                    System.out.println("\n");
                    break;
                case 4: return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
            
        
    }

    public static void insert(ArrayList<Integer> arr, int ele, int pos) {
        arr.add(pos - 1, ele);
        System.out.println("Successfully Entered");
    }

    public static int delete(ArrayList<Integer> arr, int pos) {
        return arr.remove(pos - 1);
    }
}
