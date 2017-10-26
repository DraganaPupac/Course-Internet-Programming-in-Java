package com.jsf.crud;

import java.util.ArrayList;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import com.jsf.crud.db.operations.DatabaseOperation;

@ManagedBean @RequestScoped
public class StudentBean {

	private int id;  
	private String name;  
	private String email;  
	private String password;  
	private String gender;  
	private String address;
	private String yearstudy;
	private String budget;
	private String pay;
	
	public ArrayList<StudentBean>studentsListFromDB;

	public int getId() {
		return id;	
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}  
	
	public String getYearstudy() {
		return yearstudy;
	}
	
	public void setYearstudy(String yearstudy) {
		this.yearstudy = yearstudy;
	}
	
	public String getBudget() {
		return budget;
	}
	public void setBudget(String budget) {
		this.budget = budget;
	}
	
	public String getPay() {
		return pay;
	}
	
	public void setPay(String pay) {
		this.pay = pay;
	}
	
	
	@PostConstruct
	public void init() {
		studentsListFromDB = DatabaseOperation.getStudentsListFromDB();
	}

	
	public ArrayList<StudentBean> studentsList() {
		return studentsListFromDB;
	}
	

	public String saveStudentDetails(StudentBean newStudentObj) {
		return DatabaseOperation.saveStudentDetailsInDB(newStudentObj);
	}
	

	public String editStudentRecord(int studentId) {
		return DatabaseOperation.editStudentRecordInDB(studentId);
	}
	

	public String updateStudentDetails(StudentBean updateStudentObj) {
		return DatabaseOperation.updateStudentDetailsInDB(updateStudentObj);
	}
	

	public String deleteStudentRecord(int studentId) {
		return DatabaseOperation.deleteStudentRecordInDB(studentId);
	}
}