package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Temp {
//	For objects
	@Value ("#{ new java.lang.String('Rushikesh Masule') }") 
	private String Myname;
	
	@Value ("#{ 23}")
	private String Age;
	
//	For variables
	@Value ("#{ 56+95}")
	private int addition;
	
	//for methods
	@Value ("#{T(java.lang.Math).sqrt(144)}")
	private int sqrt;

	
	//for boolean values
	@Value("#{10>0}")
	private boolean isActive;

	@Value ("#{T(java.lang.Math).PI}")
	private double PI;
	
	
	public double getPI() {
		return PI;
	}

	public void setPI(int pI) {
		PI = pI;
	}

	public String getMyname() {
		return Myname;
	}

	public void setMyname(String myname) {
		Myname = myname;
	}

	public String getAge() {
		return Age;
	}

	public void setAge(String age) {
		Age = age;
	}

	public int getAddition() {
		return addition;
	}

	public void setAddition(int addition) {
		this.addition = addition;
	}

	public int getSqrt() {
		return sqrt;
	}

	public void setSqrt(int sqrt) {
		this.sqrt = sqrt;
	}

	@Override
	public String toString() {
		return "Temp [Myname=" + Myname + ", Age=" + Age + ", addition=" + addition + ", sqrt=" + sqrt + ", PI=" + PI
				+ ", isActive=" + isActive + "]";
	}
	

	
}
