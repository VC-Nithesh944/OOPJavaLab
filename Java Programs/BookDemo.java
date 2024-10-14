import java.util.Scanner;
class Book{
    String bookName;
    String author;
    String Price;
    String num_pages;
    Scanner input = new Scanner(System.in);
    Book(){
        System.out.print("Enter the Book name: ");
        bookName = input.nextLine();
        System.out.print("Enter Author of the Book: ");
        author = input.nextLine();
        System.out.print("Enter the Price of the Book: ");
        Price = input.next();
        System.out.print("Enter the number of pages in the Book: ");
        num_pages = input.next();
    }
    void Display(){
        System.out.println("Book Name: " + bookName.toString());
        System.out.println("Author: "+author.toString());
        System.out.println("Price: "+Price.toString());
        System.out.println("Number of pages: "+num_pages.toString());
        System.out.println();
    }
}

class BookDemo{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number of Books You want to read the Data: ");
        int n = input.nextInt();
        Book books[] = new Book[n];
        for(int i=0;i<n;i++){
            System.out.println("\nEnter Book"+(i+1)+" details");
            books[i] = new Book();
        }
        System.out.println("\nThe Details of the books are: ");
        for(int i = 0; i<n;i++){
            books[i].Display();
        }
    }
}
