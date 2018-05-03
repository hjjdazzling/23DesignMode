package proxy;

public interface UserDao {
	void insert();
	void update(int value);
}

class UserDaoImpl implements UserDao {
	@Override 
	public void insert() {
		System.out.println("insert()");
	}
	
	@Override
	public void update(int value) {
		System.out.println("update()");
	}
}

class UserDaoProxy {
	private UserDao userDao;
	
	public UserDaoProxy(UserDao userDao) {
		this.userDao = userDao;
	}
	
	public void updateQuery() {
		//扩展
		System.out.println("扩展");
		userDao.update(123);
		System.out.println("扩展");
		//扩展
	}
	
	public void insertQuery() {
		//扩展
		System.out.println("扩展");
		userDao.insert();
		System.out.println("扩展");
		//扩展
	}
}
