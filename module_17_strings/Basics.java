import java.util.*;
public class Basics {
    public static void main(String[] args) {
        // strings 
  // collection of characters
  char arr[]={'a','b','c'};
  String name="sakshi";
  System.out.println(name);
  String name3=new String("sakshi");
  System.out.println(name3);
  Scanner sc=new Scanner(System.in);
  String fullname=sc.nextLine();
  System.out.println(fullname);


  //funtions of string

  //1.length function  variablename.length()
  System.out.println(fullname.length());
  for(int i=0;i<fullname.length();i++){
    System.out.println(fullname.charAt(i)+" ");

  }

   //2. concatenation of string
   String flower1="rose";
   String flower2="jasmin";
   String flower3=flower1+" "+flower2;
   System.out.println(flower3);
   
   //char at function  variablename.charAt(index);


   System.out.println(flower1.charAt(0));
   for(int i=0;i<flower1.length();i++){
    
        System.out.println(flower1.charAt(i)+" ");
    
   }




    }
}
