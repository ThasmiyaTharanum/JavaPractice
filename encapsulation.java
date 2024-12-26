class hide{
    private String name = "Joseph";   //making this variables private (if we use private keyword then variables becomes accessible to the only class in which variables are declared private)
    private int age = 5;
    //below are get methods (getters) are used to get the values i.e, to call or access the values
    public String getname(){   //creating methods so that private variables can be accessed through method name.
        return name;
    }
    public int getAge(){       
        return age;
    }

    //below are set methods (setters) are used to set the values i.e, to assign the value to variables

    public void setname(String a){
        name = a; 
    }
    //   public void setage(int n){
    //       age = n;
    //   }
   //usage of this keyword
   //for above set method if we use local variabel same as instance variable(as shown below) then to remove the ambiguity we are using this keyword
    //this refers to the current object which is calling set age.
   public void setage(int age){
       this. age = age;
      // this.setname("cold"); //this keyword is used to invoke the current class method ,even if we dont use this keyword,the compiler automaticalyy adds this keyword while invoking method
    }
}


public class encapsulation {
    public static void main(String[] args) {
        hide obj = new hide();
      //obj.name = "Joseph";  (private varaibles cannot be accessed in other classes, we can access private variables with the help of methods)
     // obj.age = 23;  
     System.out.println(obj.getname() + "  " + obj.getAge());     //private variable can be called using method name

     obj.setname("Royce");   // passing the value with help of method name.

     obj.setage(40);

     System.out.println(obj.getname() + "  " + obj.getAge());  

     
    
        
    }

}
