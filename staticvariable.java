public class staticvariable {
    public static void main(String[] args) {
       mobile mob = new mobile();
       mob.brand = "Samsung";
       mob.number = 78;
       mobile.name = "Android";
        
       mobile mob1 = new mobile();
       mob1.brand = "Honor";
       mob1.number = 89;
       mobile.name = "Smart";  //Static variable can be accessed with the help of class name.

       mobile.name = "phone"; // here we are changing the name of mob1 object name variable and it will effect in all objects wherever name variable is common.

       mob1.show();      // non static method can be called with the help of object
       mob.show();
     
       mobile.show1(mob);    // we can call static method with the help of class name.and we are passing object of non static variable
    }
}
class mobile{
     String brand;
    int number;
     static String name;   // by making this variable static , we are making this variable common for all objects.

    public void show(){
        System.out.println(brand+" "+name+" "+number);
    }
    //static method
    public static void show1(mobile obj){
        System.out.println(obj.brand+" "+name+" "+obj.number);    // we can use static variable inside static method and we cannot use non static variable inside static method. 
        // to use non static variable(brand and number) in static method we can pass the object of the particular variable during the call and parameter of method.
    }

}
// The static variables are shared by all the different objects. and if we wnat to access a variable we can do with class name.
//static keyword is a class member not a object member, hence we can access variable with class name.

//The static keyword is used to construct methods that will exist regardless of whether or not any instances of the class are generated. Any method that uses the static keyword is referred to as a static method.
//static methods can be accessed directly with regardless of object of class is created or not.that is the reason we use our main method as static method.