package Observer;

public class Test {
	public static void main(String[] args) {
		Observer ob1 = new Observer("�¿���");
		Observer ob2 = new Observer("hjj");
		Observer ob3 = new Observer("adzzling");
		
		Subject subject = new Subject("��Ӱ����");
		subject.add(ob1);
		subject.add(ob2);
		subject.add(ob3);
		
		subject.doSothing();
		
	}
}
