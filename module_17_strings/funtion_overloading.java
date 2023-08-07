public class funtion_overloading {
// funtion overloading using no of parameters
    public static int sum(int a,int b){
        return a+b;
    }
    public static int sum(int a,int b,int c){
        return a+b+c;
    }
//funtion overloading using data type
public static float sum(float a,float b){
    return a+b;
}

// no is prim or not
public static boolean isprime(int n){
    boolean isprime=true;
    for(int i=2;i<n-1;i++)
    {
        if(n%i==0){
            isprime=false;
            break;
        }
    }
    return isprime;

}
    public static void main(String[] args) {
        System.out.println(sum(2, 4));
        System.out.println(sum(3, 4,4));
        System.out.println(sum(4.0f,3.8f));
        System.out.println(isprime(4));
    }
}
