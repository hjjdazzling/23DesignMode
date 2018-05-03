package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class UserDaoHandler implements InvocationHandler {
	private UserDao userDao;
	
	public UserDaoHandler(UserDao userDao) {
		this.userDao = userDao;
	}
	
	//返回目标对象代理后的对象
	//proxy代理类的实例
	//method调用的方法，即需要执行的方法
	//args
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object obj = null;
		for(int i=0; i<args.length; i++) {
			System.out.println(args[i]);
		}
		
		if(method.getName().equals("update")) {
			System.out.println("扩展");
			obj = method.invoke(userDao, args);
			System.out.println("扩展");
		} else if(method.getName().equals("insert")) {
			System.out.println("扩展");
			obj = method.invoke(userDao, args);
			System.out.println("扩展");
		}
		return obj;
	}

}
