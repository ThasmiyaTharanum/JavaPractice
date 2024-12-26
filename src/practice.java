import java.util.ArrayList;

public class practice {

	public static void main(String args[]) {
		
	ArrayList<String> Al= new ArrayList<String>();
	Al.add("apple");
	Al.add("banana");
	Al.add("cherry");
	Al.add("mango");
	Al.add("apple");
	System.out.println(Al);
	Al.remove(0);
	System.out.println(Al);
	if(Al.contains("orange")) {
		System.out.println("orange is found");
	}
	else {
		System.out.println("orange not found");
	}
	System.out.println(Al.size());
	for(int i =0;i<Al.size();i++) {
		System.out.println(i +"\t "+ Al.get(i));
	}
	
	
	}
}
