//by default every constructor first statement is super(); even if not mentioned

class Am{              //super class or parent class (class A also extends from a class Object by default)

    public Am(){                       //default constructor
        super();               //super keyword calls the default constructor of super class   
        System.out.println("In A");

    }
    public Am(int n){                //parameterized constructor
        super();
        System.out.println("In A int ");

    }
    
}
class Cm extends Am{          //subclass of A or child class of A
    public Cm(){                            //default constructor
         super(4);     //super keyword calls the parameterized constructor of super class when value is passed
        System.out.println("In B");

    }
    public Cm(int n){                          //parameterized constructor
         this();          //this keyword calls the defaults constructor of the same class if value is not passed, if value is passed it calls parameterized constructor
        System.out.println("In B int");

    }
}

public class superkeyword {
    public static void main(String[] args) {
        Am obj = new Am();        // passing value in constructor so parameterized constructor executes first
        Cm obj1 = new Cm();
        
    }
}
