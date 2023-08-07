public class dectobin {

public static void dec_to_bin(int decno){
    int pow=0;
  
   int  bino=0;
   while(decno>0){
    int rem=decno%2;
    bino=bino+(rem*(int)Math.pow(10,pow));
    pow++;
   decno=decno/2;
   }
System.out.println(bino);

   }

    public static void main(String[] args) {
  dec_to_bin(7);
    }
}
