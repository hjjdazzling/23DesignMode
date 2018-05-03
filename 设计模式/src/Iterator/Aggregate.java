package Iterator;

public interface Aggregate {
	public void add(Object object);
	public void remove(Object obj);
	
	public MyIterator iterator();
}
