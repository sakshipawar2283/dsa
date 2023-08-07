import java.sql.Array;
import java.util.ArrayList;

public class implementation {



    /**
     * @param args
     */
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>>mainlist= new ArrayList<>();
        ArrayList<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(2);
        System.out.println(list);
        mainlist.add(list);
        ArrayList<Integer>list2=new ArrayList<>();
        list2.add(2);
        list2.add(1);
        mainlist.add(list2);

            System.out.println(mainlist);

            for(int i=00;i<mainlist.size();i++){
            ArrayList <Integer>currentlist=mainlist.get(i);
             for(int j=0; j<currentlist.size();j++){
                System.out.print(currentlist.get(j));
             }
             System.out.println();
                };
            }

    }

