package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class UserDaoHandler implements InvocationHandler {
	private UserDao userDao;
	
	public UserDaoHandler(UserDao userDao) {
		this.userDao = userDao;
	}
	
	//����Ŀ���������Ķ���
	//proxy�������ʵ��
	//method���õķ���������Ҫִ�еķ���
	//args
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object obj = null;
		for(int i=0; i<args.length; i++) {
			System.out.println(args[i]);
		}
		
		if(method.getName().equals("update")) {
			System.out.println("��չ");
			obj = method.invoke(userDao, args);
			System.out.println("��չ");
		} else if(method.getName().equals("insert")) {
			System.out.println("��չ");
			obj = method.invoke(userDao, args);
			System.out.println("��չ");
		}
		return obj;
	}

}
