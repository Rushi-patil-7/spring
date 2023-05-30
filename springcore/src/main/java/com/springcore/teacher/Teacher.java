package com.springcore.teacher;

import java.util.Map;

public class Teacher {
	private String teacherName;
	private String teacherAddress;
	private int teacherId;
	private Map<String , String> primarySubjects;
	private String teacherContact;

	
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	public String getTeacherAddress() {
		return teacherAddress;
	}
	public void setTeacherAddress(String teacherAddress) {
		this.teacherAddress = teacherAddress;
	}
	public int getTeacherId() {
		return teacherId;
	}
	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}

	public Map<String, String> getPrimarySubjects() {
		return primarySubjects;
	}
	public void setPrimarySubjects(Map<String, String> primarySubjects) {
		this.primarySubjects = primarySubjects;
	}
	public String getTeacherContact() {
		return teacherContact;
	}
	public void setTeacherContact(String teacherContact) {
		this.teacherContact = teacherContact;
	}
	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Teacher [teacherName=" + teacherName + ", teacherAddress=" + teacherAddress + ", teacherId=" + teacherId
				+ ", primarySubjects=" + primarySubjects + ", teacherContact=" + teacherContact + "]";
	}
	
	
	

}
