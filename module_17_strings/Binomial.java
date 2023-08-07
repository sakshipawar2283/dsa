import java.util.Scanner;

public class Binomial {

// factorial
    public static int fact(int n){
          int f=1;
          for(int i=1;i<=n;i++){
            f=f*i;
          }
          return f;
    }
    //binomial coeffiecient
    public static int Binomial_coefficient(int n,int r){
        int factn=fact(n);
        int factr=fact(r);
        int factnmr=fact(n-r);
        int bc=factn/(factr*factnmr);
        return bc;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of a");

        int a=sc.nextInt();
        System.out.println("enter the value of b");
        int b=sc.nextInt();
        System.out.println(Binomial_coefficient(a,b));
    }
    
}
