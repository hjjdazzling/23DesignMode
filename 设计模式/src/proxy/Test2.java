package proxy;

import java.lang.reflect.Proxy;

public class Test2 {
	public static void main(String[] args) {
		UserDao userDao = new UserDaoImpl();
		UserDaoHandler handler = new UserDaoHandler(userDao);
		
		UserDao userDaoImpl = (UserDao)Proxy.newProxyInstance(
				ClassLoader.getSystemClassLoader(), new Class[] {UserDao.class}, handler);
		userDaoImpl.update(123);
	}
}
