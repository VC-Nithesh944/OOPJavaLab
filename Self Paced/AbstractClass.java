abstract class Figure{
    int dim1, dim2;
    Figure(int a, int b){
        dim1 = a;
        dim2 = b;
    }

    abstract void Area();

    void Print(){
        System.out.println("The Area is not defined here!!\n");
    }
}

class Rectangle extends Figure{
    Rectangle(int a, int b){
        super(a, b);
    }

    void Area(){
        System.out.println("The area of the Rectangle is : "+dim1*dim2);
    }
}

class Triangle extends Figure{
    Triangle (int a, int b ){
        super(a, b);
    }

    void Area(){
        System.out.println("The area of the Triangle is : "+0.5*dim1*dim2);
    }
}

class Demo2{
    public static void main(String[] args) {
        Figure ref ;
        Rectangle Rect1 = new Rectangle(10,5);
        Triangle Tri1 = new Triangle(5,9);

        ref = Rect1;     
        ref.Area();    //The area of the Rectangle is : 50
        ref = Tri1;
        ref.Area();    //The area of the Triangle is : 22.5
    }
}