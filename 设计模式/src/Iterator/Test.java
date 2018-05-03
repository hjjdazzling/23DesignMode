package Iterator;

public class Test {
	public static void main(String[] args) {
		MyArrayList list = new MyArrayList();
		list.add("hello");
		list.add("world");
		
		MyIterator it = list.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
