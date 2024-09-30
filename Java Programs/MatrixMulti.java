import java.util.*;
public class MatrixMulti{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of the first Matrix: ");
        int m = input.nextInt();
        int n = input.nextInt();
        System.out.println("Enter the number of rows and column of the second Matrix: ");
        int p = input.nextInt();
        int q = input.nextInt();
        if (n != p){                                                                                //case to check possibility
            System.out.println("Matrix Multiplication Not possible!!");
        }
        else {
            int [][] mat1 = new int[m][n];                                                          //declaring and initializing
            System.out.println(String.format("Enter the element of the first %dx%d Matrix: ",m,n));
            for (int i = 0;i<m;i++){
                for (int j =0;j<n;j++){
                    System.out.print(String.format("Enter mat1[%d,%d]th element: ",i,j));
                    mat1[i][j] = input.nextInt();
                }
            }
            int [][] mat2 = new int[p][q];
            System.out.println(String.format("Enter the element of the first %dx%d Matrix: ",p,q));
            for (int i= 0;i<p;i++){
                for (int j=0;j<q;j++){
                    System.out.print(String.format("Enter mat2 [%d,%d]th element: ",i,j));
                    mat2[i][j] = input.nextInt();
                }
            }
            int [][]product = new int[m][q];                                                       //Product matrix calculation logic
            for (int i =0;i<m;i++){
                for (int j=0;j<q;j++){
                    for (int k=0;k<p;k++){
                        product[i][j] += mat1[i][k] * mat2[k][j];
                    }
                }
            }
            System.out.println("The product Matrix is :");                                         //Printing the Product matrix
            for (int i=0;i<m;i++){
                for (int j= 0;j<q;j++){
                    System.out.print(" "+product[i][j]);
                }
                System.out.println();
            }
        }
    }
}
