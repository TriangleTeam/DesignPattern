package com.aron.pattern;
/*
 * creation pattern 设计模式 
 * 
 * 单例模式： 类的构造方法为private,因此new关键字不能使用，提供static方法返回对象
 * 
 **/
public class SingletonPatternDemo {	
	public static void main(String[] args){
	SingletonObject instance = SingletonObject.getInstance();	
	instance.showMessage();
	}
}

class SingletonObject{
	private static SingletonObject instance = new SingletonObject();
	private SingletonObject(){
		System.out.println("initization of SingletonObject");
	};
	
	public static SingletonObject getInstance(){
		System.out.println("return singleton object");
		return instance;
	}
   
	public void showMessage(){
	      System.out.println("Hello World!");
	   }
}
