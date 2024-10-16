class Test{
    int i, j;
    Test(int a, int b){
        i = a; j = b;
    }
    boolean equals(Test obj){
        if (obj.i == i && obj.j == j)
        return true;
        else{
            return false;
        }
    }
}


public class PassByObj {
    public static void main(String args[]){
        Test obj1 = new Test(10,20);
        Test obj2 = new Test(20,30);
        Test obj3 = new Test(10,20);
        System.out.println(obj1.equals(obj2));
        System.out.println(obj2.equals(obj3));
        System.out.println(obj1.equals(obj3));
    }
    
}
