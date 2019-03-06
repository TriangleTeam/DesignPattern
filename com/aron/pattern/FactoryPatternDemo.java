package com.aron.pattern;
/*
 * creation pattern 设计模式 
 * 
 * 工厂模式： 对象的是由工厂类统一创建的，不是通过new关键字生成的
 **/
public class FactoryPatternDemo {
	public static void main(String[] args) {
		ShapeFactory sF = new ShapeFactory();
		Shape cirCle = sF.getShape("circle");
		cirCle.draw();
	}
}

interface Shape {
	void draw();
}

class CirCle implements Shape {
	public void draw() {
		System.out.println("Draw a circle");
	}
}

class Square implements Shape {
	public void draw() {
		System.out.println("Draw a square");
	}
}

class Rectangle implements Shape {
	public void draw() {
		System.out.println("Draw a rectangle");
	}
}

class ShapeFactory {
	public Shape getShape(String shapeType) {
		if (shapeType == null) {
			return null;
		}
		if (shapeType.equalsIgnoreCase("CIRCLE")) {
			return new CirCle();
		}
		if (shapeType.equalsIgnoreCase("SQUARE")) {
			return new Square();
		}
		if (shapeType.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();
		}
		return null;
	}
}
