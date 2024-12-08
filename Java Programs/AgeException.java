

class WrongAgeException extends Exception{
    public WrongAgeException(String message) {
        super(message);
    }
    
}

public class Father{
    int age;
    Father (int age) throws WrongAgeException{
        if (age < 0){
            throw new WrongAgeException("Father's age cannot be less than 0");
        }
        this.age = age;
    }
}

public class Son extends Father{
    int sonAge;
    Son (int fatherage, int sonage) throws WrongAgeException{
        super(fatherage);
        if (sonage < 0){
            throw new WrongAgeException("Son's age cannot be less than 0");
        }
        if (sonage > fatherage){
            throw new WrongAgeException("Son's age cannot be greater than fathers age");
        }
        sonAge = sonage;
    }
}

public class AgeException{
    public static void main(String[] args) {
        try {
            Father father = new Father(30);
            System.out.println("Father's age is : "+father.age);
            Son son = new Son(father.age, 20);
            System.out.println("Son's age is : "+ son.SonAge);

            Father Fat = new Father(-2);
            System.out.println("Father's age is : "+ Fat.age);

            Son son2 = new Son(father.age, 40);
            System.out.println("Son's age is :"+ son2.age);
        } catch (WrongAgeException e) {
            System.out.println("Exception Caught: "+ e);
        }
    }
}
