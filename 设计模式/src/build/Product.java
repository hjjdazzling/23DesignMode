package build;
//主食
class Food {
	private String name;
	
	public Food(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
//副食
class SecondFood {
	private String name;
	
	public SecondFood(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
//饮料
class Drink{
	private String name;
	
	public Drink(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
public class Product {
	private Food food;
	private SecondFood secondFood;
	private Drink drink;
	
	
	public Food getFood() {
		return food;
	}
	public void setFood(Food food) {
		this.food = food;
	}
	public SecondFood getSecondFood() {
		return secondFood;
	}
	public void setSecondFood(SecondFood secondFood) {
		this.secondFood = secondFood;
	}
	public Drink getDrink() {
		return drink;
	}
	public void setDrink(Drink drink) {
		this.drink = drink;
	}
	
	
}
