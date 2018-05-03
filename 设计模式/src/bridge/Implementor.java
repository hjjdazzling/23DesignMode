package bridge;

interface Implementor {
    // ʵ�ֳ��󲿷���Ҫ��ĳЩ���幦��
    public void operationImpl();
}

abstract class Abstraction {
    // ����һ�� Implementor �����γɾۺϹ�ϵ
    protected Implementor implementor;
    
    public Abstraction(Implementor implementor) {
        this.implementor = implementor;
    }
    
    // ������Ҫת��ʵ�ֲ��ֵľ���ʵ��
    public void operation() {
        implementor.operationImpl();
    }
}

class ConcreteImplementorA implements Implementor {
    @Override
    public void operationImpl() {
        // ������ʵ��
        System.out.println("����ʵ��A");
    }    
}

class ConcreteImplementorB implements Implementor {
    @Override
    public void operationImpl() {
        // ������ʵ��
        System.out.println("����ʵ��B");
    }    
}

class RefinedAbstraction extends Abstraction {

    public RefinedAbstraction(Implementor implementor) {
        super(implementor);
    }
    
    public void otherOperation() {
        // ʵ��һ���Ĺ��ܣ����ܻ�ʹ�þ���ʵ�ֲ��ֵ�ʵ�ַ���,
        // ���Ǳ���������Ŀ�����ʹ�� Abstraction �ж���ķ�����
        // ͨ�����ʹ�� Abstraction �ж���ķ�������ɸ���Ĺ��ܡ�
    	System.out.println("��������");
    }
}