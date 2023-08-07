public class bintodec {
    public static void bin_to_dec(int n){
        int pow=0;
        int decno=0;
        while(n>0){
            int ld=n%2;
            decno=decno+(ld*(int)Math.pow(2,pow));
            pow++;
            n=n/10;


        }
        System.out.println(decno);
    }
    public static void main(String[] args) {
     bin_to_dec(100);
    }
}
