package build;

//生成器接口
public interface IBuild {
	 public void createFood();      
	 public void createSecondFood();     
	 public void createDrink();      
	 public Product composite();      
	 public Product create();    
}

//生成器类
class BuildProduct1 implements IBuild {
	private Product product = new Product();

	@Override
	public void createFood() {
		product.setFood(new Food("米饭"));
	}

	@Override
	public void createSecondFood() {
		product.setSecondFood(new SecondFood("面条"));
	}

	@Override
	public void createDrink() {
		product.setDrink(new Drink("小米粥"));
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

//生成器2
//生成器类
class BuildProduct2 implements IBuild {
	private Product product = new Product();

	@Override
	public void createFood() {
		product.setFood(new Food("馒头"));
	}

	@Override
	public void createSecondFood() {
		product.setSecondFood(new SecondFood("菜"));
	}

	@Override
	public void createDrink() {
		product.setDrink(new Drink("八宝粥"));
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