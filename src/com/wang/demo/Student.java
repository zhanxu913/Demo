package com.wang.demo;


/**
 * Student类。
 * （1）属性（name，age，gender）
 * （2）方法（eat，sleep，play）
 * 
 */
public class Student {
	
	/*
	 * 在Java，属性一般用private。
	 * 访问变量，通常使用方法，方法通常定义为public。
	 * 
	 * 
	 */
	
	
	//属性
//	private String name = "";
//	public int age = 0;
//	public String gender = "";
	private String name = "";
	private int age = 0;
	private String gender = "";
	
	//构造方法，创建对象
	public Student(){
		
	}
	
	public Student(String name,int age,String gender){
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	//方法
	public void eat(){
		System.out.println(name + ",最爱吃火锅");
	}
	
	public void sleep(){
		System.out.println(name + ",每天睡20小时");
	}
	
	public void play(){
		System.out.println(name + ",最爱玩游戏");
	}
	
	public void intro(){
		System.out.println("name:" + name);
		System.out.println("age:" + age);
		System.out.println("gender:" + gender);
	}
	
	public void setName(String n){
		name = n;
	}
	
	public String getName(){
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	
}






