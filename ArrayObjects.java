public class ArrayObjects {

    public static void main(String[] args) {
        student S1 = new student();
        S1.name = "Navin";
        S1.rollno= 7;
        S1.marks=98;
       
        student S2 = new student();
        S2.name = "kavel";
        S2.rollno= 8;
        S2.marks=88;

        student S3 = new student();
        S3.name = "joseph";
        S3.rollno= 10;
        S3.marks=78;

        student Students_Data[] = new student[3]; //created Array 
        Students_Data[0]=S1;    // assigning each object to indices 0,1,2 of Array Students_Data
        Students_Data[1]=S2;
        Students_Data[2]=S3;


    // for(int i=0;i<Students_Data.length;i++){
    //     System.out.println(Students_Data[i].name + " : " + Students_Data[i].marks);
    // }
    for(student m :Students_Data){                  //enhanced for loop
        System.out.println(m.name+" : "+ m.marks);
    }


    }

   
    
}
class student{
    String name;
    int rollno;
    int marks;


}