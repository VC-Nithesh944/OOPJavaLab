/* Dynamic Dispatch -> Technique which resolves call to overridden method during Run Time rather at Compile Time*/

class Figure{                            //This is the Super Class
    int Dim1, Dim2;
    Figure(int a, int b){
        Dim1 = a;
        Dim2 = b;
    }
    void Area(){                        /*This would be the Overridden method in subclass*/
        System.out.println("The Area of the Figure is not Defined!!\n");
    }
}

class Rectangle extends Figure{         //Super Class is inherited to Subclass using "extends"
    Rectangle(int l, int b){
        super(l,b);
    }
    void Area(){
        System.out.println("The Area of the Rectangle is : "+(Dim1*Dim2)+"\n");
    }
}

class Triangle extends Figure{          //Same here as well
    Triangle(int h, int b){
        super(h,b);
    }
    void Area(){
        System.out.println("The Area of the Triangle is : "+(0.5*Dim1*Dim2)+"\n");
    }
}

public class DynamicDispatch {
    public static void main(String[] args) {
        Figure fig1 = new Figure(10,20);
        Rectangle rect1 = new Rectangle(15, 20);
        Triangle Tri1 = new Triangle(30,10);
        Figure ref1;                    //Reference Variable can be created only using Superclass
        ref1 = fig1;                    //This referencing allows us to do Dynamic Dispatch
        ref1.Area();
        ref1 = rect1;
        ref1.Area();
        ref1 = Tri1;
        ref1.Area();
    }
    
}
