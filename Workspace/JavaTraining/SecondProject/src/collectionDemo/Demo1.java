package collectionDemo;

import java.util.ArrayList;
import java.util.List;

public class Demo1 {
public static void main(String[] args) {
	List<String> names=new ArrayList<String>();
	names.add("Abhishek");
	names.add("Sourav");
	names.add("Sandeep");
	System.out.println(names);
	names.add(1, "Nayak");
	System.out.println(names);
	names.remove(1);
	System.out.println(names);
	names.clear();
	System.out.println(names.isEmpty());
}
}
