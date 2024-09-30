import java.util.*;
public class Quadratic {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Coefficients of Quadratic equation: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        double root1,root2, real,img;
        double desc = Math.pow(b,2) - 4*a*c;
        if (desc == 0){
            System.out.println("We get two equal roots");
            root1 = root2 = -b/2;
            System.out.println(String.format("The roots of the equation are : %.2f and %.2f",root1,root2));
        }
        else if (desc >0){
            System.out.println("We get two real and distinct root");
            root1 = (-b + Math.sqrt(desc))/2*a;
            root2 = (-b - Math.sqrt(desc))/2*a;
            System.out.println(String.format("The roots are %.2f and %.2f",root1,root2));
        }
        else{
            System.out.println("We get two complex roots");
            real = (double)-b/2*a;
            img = -desc/2*a;
            System.out.println("The two roots are "+real+"+"+img+"i and "+real+"-"+img+"i");
        }
    }
}
