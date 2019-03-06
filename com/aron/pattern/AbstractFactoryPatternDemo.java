package com.aron.pattern;
/*
 * creation pattern 设计模式 
 * 
 * 抽象工厂模式： 工厂生产类负责创建不同工厂
 * 每个工厂用来创建不同的对象
 **/
public class AbstractFactoryPatternDemo {
	public static void main(String[] args){
		AbstractFactory absFac = FactoryProducer.getFactory(false);
		Shape circle = absFac.getShape("circle");
		absFac = FactoryProducer.getFactory(true);
		Shape normalCircle = absFac.getShape("circle");
		circle.draw();
		normalCircle.draw();
	}
}

abstract class AbstractFactory{
	abstract Shape getShape(String shapeType);
}

class RoundedCircle implements Shape {
	   @Override
	   public void draw() {
	      System.out.println("RoundedCircle");
	   }
	}

class RoundedSquare implements Shape {
	   @Override
	   public void draw() {
	      System.out.println("RoundedSquare");
	   }
	}

class NormalFactory extends AbstractFactory{

	@Override
	Shape getShape(String shapeType) {
		// TODO Auto-generated method stub
		if (shapeType.equalsIgnoreCase("CIRCLE")) {
			return new CirCle();
		}
		if (shapeType.equalsIgnoreCase("SQUARE")) {
			return new Square();
		}
		return null;
	}	
	
}

class RoundedFactory extends AbstractFactory{
	@Override
	Shape getShape(String shapeType) {
		// TODO Auto-generated method stub
		if (shapeType.equalsIgnoreCase("CIRCLE")) {
			return new RoundedCircle();
		}
		if (shapeType.equalsIgnoreCase("SQUARE")) {
			return new RoundedSquare();
		}
		return null;
	}	
}

class FactoryProducer {
	   public static AbstractFactory getFactory(boolean rounded){   
	      if(rounded){
	         return new RoundedFactory();         
	      }else{
	         return new NormalFactory();
	      }
	   }
	}