public class aa {
    public static void main(String[] args) {
         char a='A';
         for(int line=1;line<=4;line++){
            for(int chars=1;chars<=line;chars++)
            {
                   System.out.print(a);
                   a++;
            }
            System.out.println();
         }
         int n=4;
for(int i=1;i<=n;i++){
    for(int j=1;j<=n-i;j++){
       //for sout space
      System.out.print(" ");
    
    }
    for(int j=1;j<=i;j++){
        System.out.print("*");
    }
    System.out.println();
}


for(int i=5;i>=1;i--){
    for(int j=1;j<=i;j++){
       System.out.print(j);
       
    }
    System.out.println();
}

    }
}
