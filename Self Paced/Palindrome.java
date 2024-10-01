import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num1 = input.nextInt();
        Palindrome(num1);
    }
    public static void Palindrome(int number){
        int temp, reverse = 0,remainder;
        temp = number;
        while (temp>0){
            remainder = temp%10;
            reverse = (reverse*10)+remainder;
            temp /= 10;
        }
        System.out.println("The reverse number is: " + reverse);
        if (number == reverse){
            System.out.println("The number is Palindrome!!");
        }
        else{
            System.out.println("The number is not a Palindrome!!");
        }
    }
}
