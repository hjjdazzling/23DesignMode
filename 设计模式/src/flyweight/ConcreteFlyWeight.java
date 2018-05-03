package flyweight;

public class ConcreteFlyWeight implements FlyWeight {
	private Character inState;
	
	//内蕴状态作为参数传入
	public ConcreteFlyWeight(Character inState) {
		this.inState = inState;
		System.out.println("创建" + inState);
	}
}
