import java.util.Scanner;

class Fundamental {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void getName() {
        System.out.println("The Name of the student is: " + name);
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void getAge() {
        System.out.println("The Age of the Student is: " + age);
    }
}

public class FundamentalDemo {
    public static void main(String[] args) {
        System.out.print("The number of Students: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.nextLine();  // Clear the buffer after reading an integer
        Fundamental[] student = new Fundamental[n];
        
        for (int i = 0; i < n; i++) {
            student[i] = new Fundamental();
            System.out.print("Enter the name of the student: ");
            String name = input.nextLine();
            student[i].setName(name);
            
            System.out.print("Enter the age of the student: ");
            int age = input.nextInt();
            student[i].setAge(age);
            input.nextLine();  // Clear the buffer after reading an integer
        }
        
        System.out.println("\n!!The details of the students are!!");
        for (int i = 0; i < n; i++) {
            student[i].getName();
            student[i].getAge();
        }
        
        input.close();  // Close the scanner resource
    }
}

