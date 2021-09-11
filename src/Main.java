
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Fruit> al = new ArrayList<Fruit>();
		System.out.println("Student List (ordered by name)");
		Fruit s1 =new Fruit(101,"Lemon",5000);
		al.add(s1);
		Fruit s2=new Fruit(102, "Peache",5000);
		al.add(s2);
		al.add(new Fruit(103,"Mango",3000));
		al.add(new Fruit(104,"Watemelon",4000));
		al.add(new Fruit(105,"Grape",6000));
		al.add(new Fruit(106,"Banana",2000));
		al.add(new Fruit(107,"Kiwi",2500));
		al.add(new Fruit(108,"Orange",4500));
		al.add(new Fruit(109,"Apple",3600));
		al.add(new Fruit(110,"Melon",8000));
		Collections.sort(al);
		for( Fruit s : al) {	
			System.out.println(s.toString());
		}
		
		System.out.println("Student List (reverse orderded by name)");
		
		Collections.sort(al, Collections.reverseOrder());
		for(int i=0;i<al.size(); i++) {
			System.out.println(al.get(i).toString());
		}
		
	}

}
