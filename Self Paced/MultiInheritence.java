class A{
    A(){
        System.out.println("This is Class A constructor.");
    }
}

class B extends A{
    B(){
        System.out.println("This is Class B constructor.");
    }
}

class C extends B{
    C(){
        System.out.println("This is Class C constructor.");
    }
}

public class MultiInheritence {
    public static void main(String[] args) {
        C M1 = new C();
    }
}
