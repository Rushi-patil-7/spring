package com.springcore.springcore.student;

import java.util.Properties;

public class Student {
	
	private int studentId;
	private String studentName;
	private String studentAddress;
	private long studentContact;
	private Properties props;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}
	public long getStudentContact() {
		return studentContact;
	}
	public void setStudentContact(long studentContact) {
		this.studentContact = studentContact;
	}
	public Properties getProps() {
		return props;
	}
	public void setProps(Properties props) {
		this.props = props;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAddress=" + studentAddress
				+ ", studentContact=" + studentContact + ", props=" + props + "]";
	}
	public Student(int studentId, String studentName, String studentAddress, long studentContact, Properties props) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
		this.studentContact = studentContact;
		this.props = props;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	 

}
