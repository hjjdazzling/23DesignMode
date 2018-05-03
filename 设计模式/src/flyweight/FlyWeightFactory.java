package flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyWeightFactory {
	private Map<Character, FlyWeight> map = new HashMap<>();
	
	public FlyWeight factory(Character state) {
		FlyWeight fly = map.get(state);
		
		if(fly == null) {
			 //������󲻴����򴴽�һ���µ�Flyweight����
	         fly = new ConcreteFlyWeight(state);
	         //������µ�Flyweight������ӵ�������
	         map.put(state, fly);
		}
		
		return fly;
	}
}
