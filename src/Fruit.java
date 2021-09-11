
public class Fruit implements Comparable<Fruit>{
	int no;
	String name;
	int price;
	

	public Fruit(int i, String string, int j) {
		name = string;
		no = i;
		price = j;
	}


	@Override
	public int compareTo(Fruit o) {
		// TODO Auto-generated method stub
		return name.compareTo(o.name);
	}


	@Override
	public String toString() {
		return "Student [no=" + no + ", name=" + name + ", price=" + price + "]";
	}
}