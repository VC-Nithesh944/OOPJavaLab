
import java.util.ArrayList;



public class SumMaxRev {
    public static void main(String[] args) {
        double d = 18924839483.40823348;
        float f = (float)d;
        System.out.println("The value of f is : "+f);

        char a = 'a';
        int asciiValue = (int)a;
        System.out.println("The ascii value of A is: "+asciiValue);

        int c = 10 ,b = 7;
        double result = (double) c/b;
        System.out.println(String.format("The result is: %.2f",result));
        
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");

        for (String fruit : fruits){
            System.out.print(" "+fruit);
        }
    }
}
