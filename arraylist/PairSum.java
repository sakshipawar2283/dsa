import java.util.ArrayList;

public class PairSum {
    public static int pairrsum(ArrayList<Integer>list,int target){
        int bp=-1;
           int lp=bp;;
           int rp=bp+1;
           for(int i=0;i<list.size();i++){
            if(list.get(i)>list.get(i+1)){
                bp=i;
            }

            while(lp!=rp){
                if(list.get(i)+list.get(i+1)==target){
                    return true;
                }
                else if(list.get(i)+list.get(i+1)<target){
                    lp=lp+1%n;
                }
                else{
                    rp=(n+rp-1)%n;
                }
            }
            return false;
           }
    }
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(2);
        list.add(4);
        list.add(6);
        list.add(5);
        System.out.println(list);
        
    }
}
