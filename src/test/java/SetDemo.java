import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
public static void main(String[] args) {
	Set s = new TreeSet();
	s.add(21);
	s.add(23);
	s.add(28);
	s.add(27);
	//enhanced for loop
	
	for(Object o : s) {
		System.out.println(o);
	}
	
}
}
