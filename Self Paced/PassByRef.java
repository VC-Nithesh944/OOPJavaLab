class Test{
    int i,j;
    Test(int a, int b){
        i = a;
        j = b;
    }
    void method (Test obj){
        obj.i = 5;
        obj.j = 4;
    }
}
public class PassByRef {
    public static void main(String[] args) {
        Test obj1 = new Test(10,20);
        System.out.println("the value of a and b are: "+obj1.i+" and "+obj1.j);
        obj1.method(obj1);
        System.out.println("The value of a and b are : "+obj1.i+" and "+obj1.j);
    }
}
