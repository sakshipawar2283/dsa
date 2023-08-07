import javax.sound.midi.Soundbank;

public class recursionbasics{
public static void printreverse(int n){
    if(n==1){
        System.out.println(n+"");
        return ;
    }
    System.out.println(n+" ");
      printreverse(n-1);


    public static void  main(String []args){
        int n=5;
        printreverse(n);
    }
}