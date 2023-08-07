import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

public class binary_search {
    public static void binary_search(int arr[],int n,int key){
        int mid,l=0,h=n-1;
        while(l<=h){
            mid=(l+h)/2;
            if(arr[mid]==key){
                System.out.println("key is present at index"+mid);
                break;
            }

            else if(arr[mid]<key){
                l=mid+1;
            }
            else{
                h=mid-1;
            }
        }
        if(l>h){
       System.out.println("key is not present");
        }

    }
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter value of n");
    int n=sc.nextInt();
    System.out.println("enter the numbers");
     int []arr=new int[10];
     for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
     }
     System.out.println("enter the value which u want to search");
     int key=sc.nextInt();
     binary_search(arr,n,key);
 }   
}
