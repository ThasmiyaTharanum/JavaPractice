public class array1 {
    public static void main(String[] args) {
        int calc[][] = new int[2][3];

        

        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
            calc[i][j] =(int) (Math.random()*10);    //math.random() is a library which gives random numbers.
           System.out.print(calc[i][j] + " ");
            }
           System.out.println();
        }
    }
}

// int nums[][] = new int[2][] ;  here internally we can have different number of columns , this type of array is called jagged array.
// nums[0] = new int[3];   specifying number of elements(i.e, 3) in first array
// nums[1] = new int[2];   specifying number of elements(i.e, 2) in second array