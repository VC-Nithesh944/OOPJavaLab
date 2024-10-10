class Demo{
  public static void main(String args[]){
    
    A obj1 = new A();                                                    //calls the constructor with no parameters
    System.out.println("The volume of Object 1 is: "+obj1.volume());
    
    A obj2 = new A(10,20,30);                                            //calls the constructor with three paramenters
    System.out.println("The volume of object 2 is : "+obj2.volume());

    A obj3 = new A(obj2);                                                //calls the constructor with obj as parameters
    System.out.println("The volume of object 3 is : "+obj3.volume());
  }
}

class A{
  int length, breadth , height;
  
  A(){                                     //Constructor without parameter
    length = 15;
    breadth = 25;
    height = 10;
  }
  
  A(int length, int breadth, int height){  //Constructor with paramenter --> Here this. operator is used because 
    this.length = length;                  //they have the same name for instance and parameter variables
    this.breadth = breadth;
    this.height = height;
  }

  A(A ob){                                 //Constuctor with parameter as another object
    length = ob.length;
    breadth = ob.breadth;
    height = ob.height;
  }
  
  double volume(){
    return length * breadth * height ;
  }
}
