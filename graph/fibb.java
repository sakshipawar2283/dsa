public class fibb {
    public static int fibno(int n) {
        if (n == 0 || n == 1) {
            return n;

        }

        int nm1 = fibno(n - 1);
        int nm2 = fibno(n - 2);

        return nm1 + nm2;
    }

    public static void main(String args[]){
        int n =6;
        for(int i=0;i<n;i++){
            System.out.println(fibno(i));
        }

        //
        
    }
}