package flyweight;

public class ConcreteFlyWeight implements FlyWeight {
	private Character inState;
	
	//����״̬��Ϊ��������
	public ConcreteFlyWeight(Character inState) {
		this.inState = inState;
		System.out.println("����" + inState);
	}
}
