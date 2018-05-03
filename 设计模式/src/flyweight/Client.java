package flyweight;

public class Client {
	
	public static void main(String[] args) {
		FlyWeightFactory fly = new FlyWeightFactory();
		
		fly.factory('a');
		fly.factory('a');
		fly.factory('c');
	}
}
