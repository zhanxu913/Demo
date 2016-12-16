package com.wang.ref;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;

/**
 * 反射机制。
 * 
 * 构造方法。
 * 
 */
public class Demo1 {
	
	/**
	 * 获取构造方法。
	 */
	public void test1(){
		
		//Class对象
		try {
			Class<?> c = Class.forName("com.wang.ref.Student");
			
			//获取所有构造方法
			Constructor<?>[] cons = c.getConstructors();
			
			//构造方法个数
			System.out.println("cons count:" + cons.length);
			
			//打印所有构造
			for (Constructor<?> con : cons) {
				//名字
				String name = con.getName();
				System.out.println("name:" + name);
				
				//修饰符
				int mod = con.getModifiers();
				System.out.println("mod:" + Modifier.toString(mod));
				
				//参数
				int pcount = con.getParameterCount();
				System.out.println("param count:" + pcount);
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 调用构造方法。
	 */
	public void test2(){
		
		try {
			//Class对象
			Class<?> c = Class.forName("com.wang.ref.Student");
			
			//获取有参构造
			Constructor<?> con = c.getConstructor(String.class, int.class);
			
			// 调用有参构造
			Student s = (Student)con.newInstance("zhang", 20);
			s.intro();
			s.study();
			
			/**
			 * 构造方法不仅仅通过new可以调用。
			 * 调用构造方法可以获得一个对象。
			 */
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	/**
	 * Constructor类研究。
	 * 
	 * 构造类。
	 * 
	 */
	public void test3(){
		
		/*
		 * Constructor是构造方法的类形式。
		 * 构造方法也是方法，可从一般方法的基本格式入手研究。
		 * （1）修饰符
		 * （2）返回值
		 * （3）方法名
		 * （4）方法参数
		 * （5）方法异常
		 * （6）其他 
		 */
		
		Class<Student> c = Student.class; 
		
		try {
			Constructor<?> con = c.getConstructor(String.class, int.class);
			
			//修饰符
			int mod = con.getModifiers();
			System.out.println("mod:" + Modifier.toString(mod));
			
			//名字
			String name = con.getName();
			System.out.println("name:" + name);
			
			//参数
			Parameter[] paras = con.getParameters();
			System.out.println("para count:" + paras.length);
			
			//异常
			Class<?>[] exceps = con.getExceptionTypes();
			System.out.println("excps:" + exceps.length);
			
			//其他
			//通过构造生成对象
			Student s = (Student)con.newInstance("zhao", 30);
			s.intro();
			s.study();
			
			//判断访问性
			boolean b1 = con.isAccessible();
			System.out.println("accessable:" + b1);
			
			//设置访问性
			con.setAccessible(true);
			
			boolean b2 = con.isAccessible();
			System.out.println("accessable:" + b2);
			
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * Paremeter类研究。
	 * 
	 * 参数类。
	 * 
	 */
	public void test4(){
		
		Class<Student> c = Student.class;
		
		try {
			Constructor<Student> con = c.getConstructor(String.class,int.class);
			
			Parameter[] paras = con.getParameters();
			
			for (Parameter para : paras) {
				//类型
				Class<?> type = para.getType();
				System.out.println("type:" + type);
				
				//名字
				String name = para.getName();
				System.out.println("name:" + name);
				
				//修饰符
				int mod = para.getModifiers();
				System.out.println("mod:" + Modifier.toString(mod));
			}
			
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}






