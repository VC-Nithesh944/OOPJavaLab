import java.util.Scanner;
class Book{
    String BookName, Author, Price, Num_pages;
    Book(String BookName, String Author, String Price, String Num_pages){
        this.BookName = BookName;
        this.Author = Author;
        this.Price = Price;
        this.Num_pages = Num_pages;
    }

    void Display(){
        System.out.println("\nBook Name: "+BookName.toString());
        System.out.println("Author Name: "+Author.toString());
        System.out.println("Book Price: "+Price.toString());
        System.out.println("Number of Pages: "+Num_pages.toString());
    }
}
public class BookDemo2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of Books you want to read the data: ");
        int n = input.nextInt();
        input.nextLine();                     //This line is written for the nextInt() to consume the newline
        Book book[] = new Book[n]; 
        for (int i = 0; i < n ; i++){
            System.out.print("Enter the Name of the Book"+(i+1)+": ");
            String Name = input.nextLine();
            System.out.print("Enter the Author Name: ");
            String author = input.nextLine();
            System.out.print("Enter the Price of the Book: ");
            String price = input.nextLine();
            System.out.print("Enter the Number of Pages : ");
            String pages = input.nextLine();
            book[i] = new Book(Name,author,price,pages);
            System.out.println();
        }
        System.out.print("\nHere's the Details of the Book!!\n");
        for (int i = 0; i < n ; i++){
            book[i].Display();
        }
    }
}
