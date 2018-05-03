package build;

//�������ӿ�
public interface IBuild {
	 public void createFood();      
	 public void createSecondFood();     
	 public void createDrink();      
	 public Product composite();      
	 public Product create();    
}

//��������
class BuildProduct1 implements IBuild {
	private Product product = new Product();

	@Override
	public void createFood() {
		product.setFood(new Food("�׷�"));
	}

	@Override
	public void createSecondFood() {
		product.setSecondFood(new SecondFood("����"));
	}

	@Override
	public void createDrink() {
		product.setDrink(new Drink("С����"));
	}

	@Override
	public Product composite() {
		createFood();
		createSecondFood();
		createDrink();
		return product;
	}

	@Override
	public Product create() {
		// TODO Auto-generated method stub
		return composite();
	}
}

//������2
//��������
class BuildProduct2 implements IBuild {
	private Product product = new Product();

	@Override
	public void createFood() {
		product.setFood(new Food("��ͷ"));
	}

	@Override
	public void createSecondFood() {
		product.setSecondFood(new SecondFood("��"));
	}

	@Override
	public void createDrink() {
		product.setDrink(new Drink("�˱���"));
	}

	@Override
	public Product composite() {
		createFood();
		createSecondFood();
		createDrink();
		return product;
	}

	@Override
	public Product create() {
		// TODO Auto-generated method stub
		return composite();
	}
}