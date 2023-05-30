package com.springcore.passbyreference;

import javax.security.auth.Destroyable;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class A implements InitializingBean,DisposableBean {
 private String firstname;
 private B lastname;
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public B getLastname() {
	return lastname;
}
public void setLastname(B lastname) {
	this.lastname = lastname;
}
@Override
public String toString() {
	return "A [firstname=" + firstname + ", lastname=" + lastname + "]";
}
 
@Override
public void afterPropertiesSet() throws Exception {
	System.out.println("Init method initiate");
	
}
@Override
public void destroy() throws Exception {
	System.out.println("Destroy method initiate");
	
}
 
}
