package com.djj.task1.student;

import java.util.Date;

public class Student {
	private int id;
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = (Date) time;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public int getOnline_id() {
		return online_id;
	}
	public void setOnline_id(int online_id) {
		this.online_id = online_id;
	}
	public String getWish() {
		return wish;
	}
	public void setWish(String wish) {
		this.wish = wish;
	}
	public String getRec_senior() {
		return rec_senior;
	}
	public void setRec_senior(String rec_senior) {
		this.rec_senior = rec_senior;
	}
	public String getCreate_at() {
		return create_at;
	}
	public void setCreate_at(String create_at) {
		this.create_at = create_at;
	}
	public Date getUpdate_at() {
		return update_at;
	}
	public void setUpdate_at(Date update_at) {
		this.update_at = (Date) update_at;
	}
	
	private String name;
	private String type;
	private Date time;
	private String school;
	private int online_id;
	private String wish;
	private String rec_senior;
	private String create_at;
	private Date update_at;
	
	public Student(int id, String name, String type, Date time, String school, int online_id, String wish,
			String rec_senior, String create_at, Date update_at) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.time = time;
		this.school = school;
		this.online_id = online_id;
		this.wish = wish;
		this.rec_senior = rec_senior;
		this.create_at = create_at;
		this.update_at = update_at;
	}
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	

	
	
}
