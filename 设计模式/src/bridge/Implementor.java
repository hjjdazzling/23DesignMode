package bridge;

interface Implementor {
    // 实现抽象部分需要的某些具体功能
    public void operationImpl();
}

abstract class Abstraction {
    // 持有一个 Implementor 对象，形成聚合关系
    protected Implementor implementor;
    
    public Abstraction(Implementor implementor) {
        this.implementor = implementor;
    }
    
    // 可能需要转调实现部分的具体实现
    public void operation() {
        implementor.operationImpl();
    }
}

class ConcreteImplementorA implements Implementor {
    @Override
    public void operationImpl() {
        // 真正的实现
        System.out.println("具体实现A");
    }    
}

class ConcreteImplementorB implements Implementor {
    @Override
    public void operationImpl() {
        // 真正的实现
        System.out.println("具体实现B");
    }    
}

class RefinedAbstraction extends Abstraction {

    public RefinedAbstraction(Implementor implementor) {
        super(implementor);
    }
    
    public void otherOperation() {
        // 实现一定的功能，可能会使用具体实现部分的实现方法,
        // 但是本方法更大的可能是使用 Abstraction 中定义的方法，
        // 通过组合使用 Abstraction 中定义的方法来完成更多的功能。
    	System.out.println("其他操作");
    }
}