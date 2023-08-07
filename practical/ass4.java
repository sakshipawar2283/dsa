import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;

public class ass4 {
    public static void main(String[] args) {
        String line="";
        String splitby=",";
        int sum1=0,sum2=0,sum3=0,count=0;
        try{

            BufferedReader br=new BufferedReader(new FileReader("sakshi.txt"));
            while((line=br.readLine())!=null){
           String city[]=line.split(splitby);
           System.out.println("City [Name=" + city[0] + ", Temperature=" + city[1] + ", Dew_Point=" + city[2] + ", Wind_Speed=" + city[3] +"]");  
            }

        }
        catch(IOException e){
e.printStackTrace();
        }
    }
}
