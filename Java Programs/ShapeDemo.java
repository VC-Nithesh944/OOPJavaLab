abstract class Shape{
    int Integer1, Integer2;
    Shape(int a, int b){
        Integer1 = a;
        Integer2 = b;
    }
    Shape(int a){
        Integer1 = a;
    }
    abstract void printArea();
}

class Rectangle extends Shape{
    Rectangle(int l, int b){
        super(l,b);
    }

    void printArea(){
        System.out.println("The area of the Rectangle is: "+Integer1*Integer2);
    }
}

class Triangle extends Shape{
    Triangle(int h, int b){
        super(h,b);
    }

    void printArea() {
        System.out.println("The area of the Triangle is : "+ 0.5*Integer1*Integer2);
    }
}

class Circle extends Shape{
    Circle(int r){
        super(r);
    }
    void printArea(){
        System.out.println("The area of the Circle is : "+ 3.14 * Integer1*Integer1);
    }
}

class ShapeDemo{
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(10, 20);
        Triangle tri1 = new Triangle(10,20);
        Circle circle1 = new Circle(10);

        Shape ref;
        ref = rect1;
        ref.printArea();
        ref = tri1;
        ref.printArea();
        ref = circle1;
        ref.printArea();
    }
}