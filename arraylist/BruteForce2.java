import java.util.ArrayList;

public class BruteForce2 {
    public static int Storedwater(ArrayList<Integer> height) {
        int maxwater = 0;
       /*  for (int i = 0; i < height.size(); i++) {
            for (int j = i + 1; j < height.size(); j++) {
                int ht = Math.min(height.get(i), height.get(j));
                int width = j - i;
                int currentwater = ht * width;
                maxwater = Math.max(maxwater, currentwater);

            }
        }*/


        int lp=0;
        int rp=height.size()-1;
        while(lp<rp){
            int ht=Math.min(height.get(lp),height.get(rp));
            int width=rp-lp;
        int currentwater=ht*width;
        maxwater=Math.max(maxwater, currentwater);
        if(height.get(lp)<height.get(rp)){
            lp++;
        }
        else{
            rp--;
        }
        }

        return maxwater;
    }

    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(8);
        height.add(5);
        height.add(1);
        height.add(4);
        height.add(7);
        System.out.println(height);
        System.out.println(Storedwater(height));

    }
}
