public class matrix {

    public static void print_matrix(int a[][]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void search(int a[][]){
//time complexity is O(n^2) need to use binary search it will reduce as nlogn
        //largest
       int largest=Integer.MIN_VALUE;
       for(int i=0;i<a.length;i++){
        for(int j=0;j<a[0].length;j++){
            if(largest<a[i][j]){
                largest=a[i][j];
                
            }
           
        }
       
       }
       System.out.println("largest no inside array is"+largest);
       //smallest
       int smallest=Integer.MAX_VALUE;
       for(int i=0;i<a.length;i++){
        for(int j=0;j<a[0].length;j++){
            if(smallest>a[i][j]){
           smallest=a[i][j];
            }
        }
    }
       System.out.println("smallest no of array is"+smallest);
    }

    public static void main(String[] args) {
        int[][] a = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        print_matrix(a);
        search(a);

    }
}