class calculator{

public int calc(int n1, int n2){

int result = n1 + n2;
   
   return result;
   
}
   
}

class first
{
public static void main (String a[])
{
   calculator add = new calculator();   //creating object for class calculator
   int result = add.calc(4,5);

  System.out.println(result);




}
}