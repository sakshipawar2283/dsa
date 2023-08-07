import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

public class array2 {
    // pattern
    /*  public static void diamond(int n){
        //1st half
         for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print( " ");
            }
            for(int j=1;j<=(2*i-1);j++){
                System.out.print("*");
            }

            System.out.println();
        }
        //2nd half
        for(int i=n;i>=1;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i-1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // print diamond
        diamond(10);
        
    } */


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int marks[]=new int[100];
        System.out.println("enter the marks");
        marks[0]=sc.nextInt();
        marks[1]=sc.nextInt();
        marks[2]=sc.nextInt();
        System.out.println("marks of physics is"+marks[0]);
        System.out.println("marks of chemistry is"+marks[1]);
        System.out.println("marks of maths is"+marks[2]);
        marks[2]=96;
        System.out.println("modified marks of maths is"+marks[2]);
     int avg =(marks[0]+marks[1]+marks[2])/3;
     System.out.println("percentage is"+avg);
       System.out.println(marks.length);

       
    }
}
