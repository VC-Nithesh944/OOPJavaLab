public class Calculator1 {
    public static int add(int a, int b){
        return (a+b);
    }

    public static int subtract( int a, int b){
        return(a-b);
    }

    public static long multiply( int a , int b){
        return (a*b);
    }

    public static double divide(int a, int b){
        if (b == 0){
            return (-1);
        }
        return ((double)a/b);
    }
}

class Calculator{

    //Static are used to access method in a class without creating objects
    public static void main(String[] args) {
        long a = Calculator1.add(5,6);
        long b = Calculator1.multiply(5,6);
        long c = Calculator1.subtract(5,6);
        double d = Calculator1.divide(5,6);

        System.out.println("The result are "+a+" "+ b+ " "+ c + " and " + d);
    }
}
