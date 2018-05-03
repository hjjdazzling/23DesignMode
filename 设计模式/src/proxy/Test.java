package proxy;

public class Test {
	public static void main(String[] args) {
		UserDao userDao = new UserDaoImpl();
		UserDaoProxy proxy = new UserDaoProxy(userDao);
		proxy.updateQuery();
		proxy.insertQuery();
		
	}
}
