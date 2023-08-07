package array;

import java.util.Scanner;

public class linear_search {
    public static void  linearsearch(int arr[],int key){
          
      
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ente the marks of student");
        int n=sc.nextInt();
        int []arr=new int [20];
        for(int i=0;i<n;i++ ){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the key which you want to search");
        int key=sc.nextInt();
        linearsearch(arr, key);
    } 
}
