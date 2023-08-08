package com.restApi.StudentsData;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student_Deatails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int S_RollNum;
	@Override
	public String toString() {
		return "Student_Deatails [S_RollNum=" + S_RollNum + ", s_Name=" + s_Name + ", Sce=" + Sce + ", Fee=" + Fee
				+ "]";
	}
	private String s_Name;
	private String Sce;
	private float Fee;
	public Student_Deatails() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Student_Deatails(int s_RollNum, String s_Name, String sce, float fee) {
		super();
		S_RollNum = s_RollNum;
		this.s_Name = s_Name;
		Sce = sce;
		Fee = fee;
	}
	
	public int getS_RollNum() {
		return S_RollNum;
	}
	public void setS_RollNum(int s_RollNum) {
		S_RollNum = s_RollNum;
	}
	public String getS_Name() {
		return s_Name;
	}
	public void setS_Name(String s_Name) {
		this.s_Name = s_Name;
	}
	public String getSce() {
		return Sce;
	}
	public void setSce(String sce) {
		Sce = sce;
	}
	public float getFee() {
		return Fee;
	}
	public void setFee(float fee) {
		Fee = fee;
	}
	

}
