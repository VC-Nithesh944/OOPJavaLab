class GenericsDemo2{
    public static void main(String[] args) {
        Generics2<Integer,Double> id = new Generics2<Integer,Double>(40,56.2);
        System.out.println("The Auto Boxed values are: "+id.getobj1()+" and "+id.getobj2());
        int num1= id.getobj1();
        double num2 = id.getobj2();
        System.out.println("\nThe Auto Unboxed value are : "+ num1 + " and " + num2);
    }
}
class Generics2<T,V>{
    T obj1 ; V obj2;

    Generics2(T obj1, V obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    T getobj1(){
        return this.obj1;
    }

    V getobj2(){
        return this.obj2;
    }

    void showType(){
        System.out.println("The Type of T and V are "+ obj1.getClass().getName() + " and " + obj2.getClass().getName());
    }
    
}
