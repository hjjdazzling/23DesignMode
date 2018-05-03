package factory;

interface FactoryCar {  
    public Car createCar();
}  
  
class FactoryBMW implements FactoryCar{  
  
    @Override  
    public BMW createCar() {  
  
        return new BMW();  
    }  
  
}  
class FactoryDaZhong implements FactoryCar {  
    @Override  
    public DaZhong createCar() {  
  
        return new DaZhong();  
    }  
}  
