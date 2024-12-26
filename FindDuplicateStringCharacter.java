public class FindDuplicateStringCharacter{
    
    public static void main(String[] args) {
        
        String str = "Hackerrank".toLowerCase();
        char[] str2 = str.toCharArray();

        boolean isNotDuplicate = false;
      

          for (int i=0; i<str2.length;i++){
               boolean isDuplicate = false;

               for (int j=i+1;j<str2.length;j++){
                     if (str2[i]==str2[j]){
                        isDuplicate= true;
                        break;
                     }


               }
                 if (isDuplicate){
                	 System.out.println(str2);
                
                  isNotDuplicate = true;
                 }
                
          }
        

          if (!isNotDuplicate){
            System.out.println("No duplicates found");
         } 

    
    }
}