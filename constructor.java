

class human{

    private int age;      //private variable
    
    public int getheart(){  //a getter method
       return age;
             
    }
    public void setheart(int a){  //a getter method
       age = a;
             
    }
    

    //Constructor is same as method hence it is called as special method.
    //no return type in constructor
    // constructor name is same as class name
    //everytime a new object is created constructor is called by compiler.
    //by default we can assign values to variables with the help of constructor
    //even if we dont create a constructor compiler will automatically create constructor and keep the block empty, but if we want to give default values we can create constructor
    public human(){    //Constructor     (this is a default constructor).
        System.out.println("in constructor");
        age = 20;

    }
    public human(int n){  //this is called parameterized constructor as parameters are passing
        age = n;
    }
}

public class constructor {
 public static void main(String[] args) {

    human obj=new human(40);   //passing the age value in object
    human obj1=new human();   //hence we created two objects so compiler called constructor twice
    
    System.out.println(obj1.getheart()); //hence we didn't assign any value to age but it is taking default comstructor value
    
    System.out.println(obj.getheart()); //here we have passed the value of age in obj object 
 }   
}
