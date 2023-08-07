import java.util.ArrayList;

public class Array_List {
    public static void swap(ArrayList<Integer> list, int indx1, int indx2) {
        int temp = list.get(indx1);
        list.set(indx1, list.get(indx2));
        list.set(indx2, temp);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // add function tc is O(1)
        list.add(1);
        list.add(2);
        list.add(3);
        int indx1=1,indx2=2;
        System.out.println(list);
        swap(list, indx1, indx2);
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        // get function
        int element = list.get(2);
        System.out.println(element);
        // set function
        list.set(2, 55);
        System.out.println(list);
        // remove elemnt
        list.remove(2);
        System.out.println(list);
        System.out.println(list.contains(2));
        // print array list in reverse order
        for (int i = list.size() - 1; i >= 00; i--) {
            System.out.println(list.get(i));
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < list.size(); i++) {
            if (max < list.get(i)) {
                // max=list.get(i);
                max = Math.max(max, list.get(i));
            }
            System.out.println(max);
        }
      
       


    }
}
