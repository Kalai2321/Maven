import java.util.List;
import java.util.ArrayList;

public class ListDemo {
	public static void main(String[] args) {
		List <Integer> l = new ArrayList();
		//l.add('F');
		//l.add("Friends Class");
		l.add(100);
		//l.add(78.09);
		l.add(100);
		System.out.println(l);

		// To know index
		/*int i = l.indexOf("Friends Class");
		System.out.println(i);*/
		// To knoe last index of
		int li = l.lastIndexOf(100);
		System.out.println(li);

		// To fetch particular value
		/*Object o = l.get(3);
		System.out.println(o);*/

		// To add values
		/*l.add(4, 21);
		System.out.println(l);*/
		
		//To remove any value
		l.remove(2);
		System.out.println("After Removing data - " + l);
		
		//TO replace values
		l.set(2, 99);
		System.out.println("Set " + l);

				
	}

}
