public class array {
    public static void main(String[] args) {
        
    //  int num[] = {10,9,8,7,5};
    //   for(int i=0;i<num.length;i++){
    //     System.out.println(num[i]);
    //   }

    
     
       int nums[] = new int[4];    // creating array of size 4 with new keyword.
       nums[1]= 2;                //assigning value to index 1
    //    for(int i=0;i<nums.length;i++){
    //    System.out.println(nums[i]);
    //    }

    for(int k : nums){       //enhanced for loop or for each loop : loop gives any value that is stored by a variable k(example) from array nums.
        System.out.println(k);
    }
     }
}
