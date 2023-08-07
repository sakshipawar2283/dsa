public class linked_list {
    public static class node{
         int data;
         node next;
          public node(int data){
            this.data=data;
            this.next=null;
          }

    }

    public static  node head;
    public static node tail;
    public static int size;
    public void addfirst(int data){
        node newnode=new node(data);
        size++;
        if(head==null){
            head=tail=newnode;
            return;
        }
        newnode.next=head;
        head=newnode;
    }
    public void addlast(int data){
        node newnode=new node(data);
        size++;
        if(head==null){

            head=tail=newnode;
            return;
        }

        tail.next=newnode;
        tail=newnode;
    }
    public void print(){
        node temp=head;
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        
        while(temp!=null){
            System.out.print(temp.data+ "-> ");
            temp=temp.next;
        }
 System.out.println("null");
    }


    public void add(int idx,int data){
        
        if(idx==0){
            addfirst(data);
            return;
        }
        node newnode=new node(data);
        size++;
        node temp=head;
        int i=0;
        //idx-1 will be prev node of that node
        while(i<idx-1){
            temp=temp.next;
            i++;
        }

        newnode.next=temp.next;
        temp.next=newnode;

    }
    public int removefirst(){
        if(size==0){
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;

        }
        int val=head.data;
        head=head.next;
        size--;
        return val;
    }
    public int removelast(){
       if(size==0){
        System.out.println("ll is empty");
        int val=Integer.MIN_VALUE;
        return val;
       } 
       else if(size==1){
        int val=head.data;
        head=tail=null;
        size=0;
        return val;
       }
       //prev=size-2
       node prev=head;
       for(int i=0;i<size-2;i++){
        prev=prev.next;
       }
       int val=prev.next.data;
   prev.next=null;
   tail=prev;
   size--;
   return val;
       
    }

    //iterative search (linear searching of key ) tc is o(n)
    public int itrsearch(int key){
        node temp=head;
        int i=0;
        while(temp!=null){
            if(temp.data==key){
                return i;

            }
            temp=temp.next;
            i++;
        }
        return -1;
    }

    public int helper(node head,int key){
        if(head==null){
            return -1;
        }
        if(head.data==key){
            return 0;
        }
        int idx=helper(head.next, key);
        if(idx==-1){
            return -1;
        }
          return idx+1;
    }
    public int recsearch(int key){
       return helper(head, key);

    }
 public static void main(String[] args) {
        linked_list ll=new linked_list();
      ll.print();
      ll.addfirst(2);
      ll.addlast(4);
      ll.print();
      ll.add(1, 8);
      ll.print();
      System.out.println(ll.size);
      ll.removefirst();
      ll.print();
      ll.removelast();
      ll.print();
      System.out.println(ll.itrsearch(8));
      System.out.println(ll.itrsearch(10));
      System.out.println(ll.recsearch(8));
    }
}
