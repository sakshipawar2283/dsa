public class spiral_matrix{

    public static void spiral_print(int a[][]){
  int startrow=0;
  int starcol=0;
  int endrow=a.length-1;
  int endcol=a[0].length-1;

  //continon
  while(startrow<=endrow && starcol<=endcol){
    //top
    for(int j=starcol;j<=endcol;j++){
        System.out.print(a[startrow][j]+"");
    }

    //right
    for(int i=startrow+1;i<=endrow;i++){
        System.out.print(a[i][endcol]+" ");
    }

    //bottom
    for(int j=endcol-1;j>=starcol;j--){
        if(startrow==endrow){
            break;
        }
        System.out.print(a[endrow][j]);
    }
//left
    for(int i=endrow-1;i>startrow;i--){

        if(starcol==endcol){
            break;
        }
        System.out.print(a[i][starcol]+ "");
    }


    starcol++;
    startrow++;
    endcol--;
    endrow--;
  }
System.out.println();

    }
    public static void main(String[] args) {
        int a[][]={
           {2,3,4,5},
           {1,6,7,8},
           {7,6,5,4},
           {12,3,4,7}
        };

        //call
        spiral_print(a);
    }
}