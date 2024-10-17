import java.awt.*;
class Circle{
    Point center; int radius;
    Circle(Point center, int radius){
        this.center = center;
        this.radius = radius;
    }
    
    double getArea(){
        return 3.14 * Math.pow(radius,2);
    }
    
    void setCenter(Circle obj){
        this.center = obj.center;
    }
    
    void setRadius(Circle obj){
        this.radius = obj.radius;
    }
}

class Demo{
    public static void main (String args[]){
        Point c1 = new Point(10,20);
        Point c2 = new Point(1,3);
        Circle fig1 = new Circle(c1,7);
        Circle fig2 = new Circle(c2,5);
        System.out.println("The area of circle 1 is : "+fig1.getArea());  //The area of circle 1 is : 153.86
        System.out.println("The area of circle 2 is : "+fig2.getArea());  //The area of circle 2 is : 78.5
        fig2.setRadius(fig1);
        System.out.println("The area of circle 2 is : "+fig2.getArea());  //The area of circle 2 is : 153.86

        System.out.println("The center of the first Circle is at : "+fig1.center);  //[x=10,y=20]
        System.out.println("The center of the second Circle is at : "+fig2.center); //[x=1,y=3]
        fig2.setCenter(fig1);
        System.out.println("The center of the second Circle after passing object is at: "+fig2.center); //[x=10,y=20]
    }
}