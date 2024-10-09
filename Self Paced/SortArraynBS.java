import java.util.Arrays;
import java.util.Scanner;

class ArraySort {
    public static void main(String args[]) {
        int[] numbers = {3, -1, 4, -5, 2, -6, -2, 1};
        Arrays.sort(numbers);
        System.out.println("The Sorted numbers: " + Arrays.toString(numbers));
        
        char[] characters = {'b', 'z', 'S', 'B', 'a', 'A'};
        Arrays.sort(characters);
        System.out.println("The Sorted Characters: " + Arrays.toString(characters));
        
        int[] unicode = {'b', 'z', 'S', 'B', 'a', 'A'};
        Arrays.sort(unicode);
        System.out.println("The Sorted Unicode: " + Arrays.toString(unicode));
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the element whose index needs to be found: ");
        int key = input.nextInt();
        int index = Arrays.binarySearch(numbers, key);
        System.out.println("The element is found at index: " + index);
        
        System.out.print("Enter the character whose index needs to be found: ");
        char key2 = input.next().charAt(0);
        int charIndex = Arrays.binarySearch(characters, key2);
        System.out.println("The character is found at index: " + charIndex);
        
        input.close();
    }
}
