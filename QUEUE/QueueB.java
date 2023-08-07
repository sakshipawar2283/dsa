public class QueueB {
    static class Queue{
        static int arr[];
        static int rear;
        static int size;
        Queue(int n){
           arr=new int[n];
           size=n;
           rear=-1;

        }
        public static boolean isempty(){
            return rear==-1;
        }
        public static void add(int data){
            if(rear=size-1){
                System.out.println("queue is full");
                return;
            }
            rear=rear+1;
            arr[rear]=data;
        }
    }
    public static void main(String[] args) {
        
    }
}
