public class Aboutstrings {
    public static void main(String[] args) {
        String name = "Joseph";     // object creates automatically in heap memory. once the object is created cant change the string
        name = name + "paul";  //append the string to existing string but we are not changing complete string,hence there is special place for strings in heap memory known as string constant pool where string objects get created.
        System.out.println(name);

        StringBuffer sb = new StringBuffer("Hello"); //(0/p: 16+5=21) even if we pass the string "Hello", it still gives extra 16 character space because every time we change data, it consumes continues memory allocation inside Heap memory what is there is no continues memory then it will relocate the string that means it uses this 16 char space.
        System.out.println(sb.capacity());  // generally string buffer capacity is 16 by default.
        sb.insert(4, 0);  //we have many string methods to use 
        System.out.println(sb);
       


    }
}
// strings are immutable (unchangeable) by default.
//mutable string : changeable string and immutable string 
//when we talk about mutable string we use two classes stringBuffer and stringBuilder
//stringBuffer has a string which is mutable
//stringbuffer and stringbuilder is same, the only difference is stringbuffer is thread safe and stringbuilder is not 