public class Compression {


    /**
     *
     * 
     */
    public static String compress(String str){
          String nestr=" ";
          for(int i=0;i<str.length();i++){
        Integer  count=1;
            while(i<str.length()-1  && str.charAt(i)== str.charAt(i+1)){
                count++;
                i++;
            }
              nestr+=str.charAt(i);
              if(count>1){
                nestr+= count.toString();
              }

          }
        return nestr;
    }
  
    public static void main(String[] args) {
        String str="aaaaaaaaaaabbb";
        
        String s=compress(str);
        System.out.println(s);
    }
}