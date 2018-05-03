package single;

//懒汉式
public class Configuration {
	private String driver = "com.mysql.jdbc.Driver";
	private String url = "jdbc:mysql://127.0.0.1/数据库名";
	private String user = "root";
	private String password = "haojunjie";
	//私有的对象应用指向自己
	private static Configuration configuration;
	
	//构造方法私有化
	private Configuration() {}
	
	//提供一个公有的方法获取单例对象
	public static Configuration getConfiguration() {
		if(configuration == null) {
			synchronized(Configuration.class) {
				if(configuration == null) {
					configuration = new Configuration();
				}
			}
		}
		return configuration;
	}

	public String getDriver() {
		return driver;
	}

	public String getUrl() {
		return url;
	}

	public String getUser() {
		return user;
	}

	public String getPassword() {
		return password;
	}
	
	
}
