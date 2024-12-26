public class Demo {
    public static void main(String[] args) {
        
    int[] ages = {21,23,25,27};
    int l =ages.length;
    int sum=0;
    for(int age:ages){
        sum+= age;
        
    }
    int avg= sum/l;
    System.out.println(avg);
    
    
}
}