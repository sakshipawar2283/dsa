public class Bubble {
    public static void bubblesort(int arr[]){
        int i,j;
        int n=arr.length;
        for( i=0;i<n-1;i++){
            for(j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){  

                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                }

            }
        }
    }

     public static void main(String[] args) {
        int arr[]={2,4,5,7,1};
        bubblesort(arr);
         for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
         }
         System.out.println();
     }
}
