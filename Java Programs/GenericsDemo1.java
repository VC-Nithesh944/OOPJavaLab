class GenericsDemo1 {
    public static void main(String args[]){
        Generic1<Integer> i = new Generic1<Integer>(20);
        System.out.println("The Auto boxed value is : "+ i.getobj());

        float num = i.getobj();         //This got converted from object to value
        int num1 = i.getobj();
        System.out.println("The auto unboxed value in int is "+ num1 + " in float is "+ num);

        i.showType();

        Generic1<Float> f = new Generic1<Float>(43.2F);
        System.out.println("The Auto boxed value is : "+ f.getobj());

        float num3 = f.getobj();
        double num4 = f.getobj();
        System.out.println("The Auto Unboxed value in float is : "+num3+ " and typecasted to double is: " + num4);

    }
}

class Generic1 <T>{
    T obj;
    Generic1 (T obj){
        this.obj = obj;
    }

    T getobj(){
        return this.obj;
    }

    void showType(){
        System.out.println("The Type of T is : "+ obj.getClass().getName());
    }
}