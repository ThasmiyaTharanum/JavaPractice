
//we can import the class files from packages folder as shown below
// system is also imported from a file java.lang by default. every file imports java.lang package
// to import all the files of package we can use * (star), note that it imports only files not folders inside the package.
//import packages.advancecalc;
//import packages.basiccalc;
    //    (or)
    import packages.*;  // * (star) imports all the files of packages
   

public class maincalci {
    public static void main(String[] args) {
        basiccalc obj = new basiccalc();
        advancecalc obj1 = new advancecalc();
       int r1 = obj.add(4, 2);
       int r2 = obj.sub(4, 2);
       int r3 = obj1.mul(4, 2);
       int r4 = obj1.div(4, 2);

       System.out.println(r1+" "+r2 +" "+ r3 + " "+r4);
    }
    
}
