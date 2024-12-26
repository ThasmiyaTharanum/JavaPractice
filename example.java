
public class example {

  public static void main(String[] args) {

    int N = 10, flag;
    for (int i = 1;i<=N;i++){
      
      if (i ==0|| i ==1)
       continue;
       flag =1;
      for (int j =2; j<i/2;j++){
         if(i%j==0)
         flag =0;
        
      }
      if (flag ==0)
      System.out.println("The prime number are"+ i);
    }
  }
}
