class A{
    public A(){
        System.out.println("Object created");
    }
}

public class Anonymousobject {
    public static void main(String[] args) {
      //  A obj = new A();    //object of class A is created ,this type of objects is called referenced ojects as we are creating reference variable "obj" .
       new A(); // this type of objects is called Anonymous objects as there is no reference used.the only pblm with tis type of variable is we cant reuse them,   
    }
}
