package flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyWeightFactory {
	private Map<Character, FlyWeight> map = new HashMap<>();
	
	public FlyWeight factory(Character state) {
		FlyWeight fly = map.get(state);
		
		if(fly == null) {
			 //如果对象不存在则创建一个新的Flyweight对象
	         fly = new ConcreteFlyWeight(state);
	         //把这个新的Flyweight对象添加到缓存中
	         map.put(state, fly);
		}
		
		return fly;
	}
}
