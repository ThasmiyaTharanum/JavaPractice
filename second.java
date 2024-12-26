public class second {
    public static void main(String[] args) {
 
        addition ad = new addition();

      int result = ad.add(4,5);

    System.out.println(result);

        
    }
}
class addition{
    public int add(int n1, int n2, int n3){

        return n1+n2+n3;

    
    }
    public int add(int n1, int n2){

        return n1+n2;

    
    }
    public double add(double n1, int n2){

        return n1+n2;

    
    }
}

//method overloading: Same method name, different number of parameters, same number of parameters or type different.