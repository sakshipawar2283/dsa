public class diagnoal {

    public static int print_sumofdig(int a[][]) {
        int sum = 0;
        /*
         * for(int i=0;i<a.length;i++){
         * for(int j=0;j<a[0].length;j++){
         * if(i==j){
         * sum+=a[i][j];
         * }
         * 
         * else if(i+j==a.length-1) {
         * sum+=a[i][j];
         * 
         * }
         * }
         * }
         */

        for (int i = 0; i < a.length; i++) {
            sum += a[i][i];
            if (i != a.length - 1 - i) {
                sum += a[i][a.length - 1 - i];
            }

        }
        return sum;
    }

    public static void main(String[] args) {
        int a[][] = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
         System.out.println(print_sumofdig(a));
    }
}
