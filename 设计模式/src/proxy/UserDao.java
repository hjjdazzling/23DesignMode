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
		//��չ
		System.out.println("��չ");
		userDao.update(123);
		System.out.println("��չ");
		//��չ
	}
	
	public void insertQuery() {
		//��չ
		System.out.println("��չ");
		userDao.insert();
		System.out.println("��չ");
		//��չ
	}
}
