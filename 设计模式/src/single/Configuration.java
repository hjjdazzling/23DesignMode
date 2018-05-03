package single;

//����ʽ
public class Configuration {
	private String driver = "com.mysql.jdbc.Driver";
	private String url = "jdbc:mysql://127.0.0.1/���ݿ���";
	private String user = "root";
	private String password = "haojunjie";
	//˽�еĶ���Ӧ��ָ���Լ�
	private static Configuration configuration;
	
	//���췽��˽�л�
	private Configuration() {}
	
	//�ṩһ�����еķ�����ȡ��������
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
