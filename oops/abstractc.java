abstract class base{
   //method withod implementation known as abstract class

   // abstaract class is used for hiding of data 
   // object of abstraction is not created if one method of class is abstract all methods are abstract and class is also abtsract
   //it is possible to create a reference of abstract class    
   abstract void hey();
}
class derived extends base{
   public void hey(){
      System.out.println("helloooo dear how are you ?");
   }
}
public class abstractc {
   public static void main(String[] args) {
     derived d=new derived();
     d.hey();


   } 
}
