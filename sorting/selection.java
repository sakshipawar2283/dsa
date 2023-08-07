public class selection {

    public static void selectionsort(int a[]){
        int minpost;
       for(int i=0;i<a.length;i++){
        minpost=i;
        for(int j=i+1;j<a.length;j++){
            if(a[minpost]>a[j]){
                minpost=j;
            }
            int temp=a[minpost];
            a[minpost]=a[i];
            a[i]=temp;

        }
       }
    }
    public static void main(String[] args) {
        int a[]={2,1,4,3,7,0};
        selectionsort(a);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]);
        }
        System.out.println();
    }
}
