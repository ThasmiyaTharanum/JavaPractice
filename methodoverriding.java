class Ak{
  
    public int add(int n1, int n2){
        return n1+n2;
    }

}
class B extends Ak{

    public int add(int n1, int n2){      // class A and B two method names are same but when we call method name of child class it is first executing its own method instead of parent method ,that means child class method is overriding parent class method
        return n1+n2+1;
    }
   

}

public class methodoverriding {
    public static void main(String[] args) {
        
        B obj = new B();
        int r1 =  obj.add(3,4);
        System.out.println(r1);

        
    }
}
