package com.springcore.passbyreference;

public class B {

	private String lastname;

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	@Override
	public String toString() {
		return "B [lastname=" + lastname + "]";
	}
	
}
