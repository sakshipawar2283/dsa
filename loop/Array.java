public class Array {
    public static void main(String[] args) {
        //single dimentional array
        int []a={1,2,3,4,5,2,6,7,8,9,54};
        for(int i=0;i<a.length;i++){
            System.out.println("elements :"+a[i]);
           
        }
        //two dimensional array
        int[][] arr={{10,20},{30,40},{50,60}};//declaration and initialization   
        System.out.println("Two dimensional array elements are");    
        for (int i = 0; i < 3; i++) 
        {
                for (int j = 0; j < 2; j++) 
            {
                    System.out.println(arr[i][j]+ "");
                }
        }

  // 3d array
        int [][][] arry={{{3,4},{4,6}},{{12,34},{4},{5,8}}};
        for(int[][] ar2d:arry){
            for(int[] ar1d:ar2d){
                for(int s:ar1d){
                    System.out.println(s);
                }
            }
        }

    }
}
