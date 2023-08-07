import java.util.*;
public class fib {

    public static void  fibonaccino(int n){

    int t1=0, t2=1;
    int num=n;
    int sum=0;
    int i=1;
    while(i<=num){
        System.out.println(t1);
         sum=t1+t2;
         t1=t2;
         t2=sum;
         i++;

    }
        
    }
    public static void main(String args[]){
    
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
       fibonaccino(n);
    }
}
