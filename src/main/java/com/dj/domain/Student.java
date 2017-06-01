package com.dj.domain;

public class Student {

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Student(long id, String name, String qq, String type, long time, String school, int onlineId, String wish,
			String recSenior, long createAt, long updateAt) {
		super();
		this.id = id;
		this.name = name;
		this.qq = qq;
		this.type = type;
		this.time = time;
		this.school = school;
		this.onlineId = onlineId;
		this.wish = wish;
		this.recSenior = recSenior;
		this.createAt = createAt;
		this.updateAt = updateAt;
	}

	private long id;
	private String name;
	private String qq;
	private String type;
	private long time;
	private String school;
	private int onlineId;
	private String wish;
	private String recSenior;
	private long createAt;
	private long updateAt;
	
	public long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getQq() {
		return qq;
	}
	public String getType() {
		return type;
	}
	public long getTime() {
		return time;
	}
	public String getSchool() {
		return school;
	}
	public int getOnlineId() {
		return onlineId;
	}
	public String getWish() {
		return wish;
	}
	public String getRecSenior() {
		return recSenior;
	}
	public long getCreateAt() {
		return createAt;
	}
	public long getUpdateAt() {
		return updateAt;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setQq(String qq) {
		this.qq = qq;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void setTime(long time) {
		this.time = time;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public void setOnlineId(int onlineId) {
		this.onlineId = onlineId;
	}
	public void setWish(String wish) {
		this.wish = wish;
	}
	public void setRecSenior(String recSenior) {
		this.recSenior = recSenior;
	}
	public void setCreateAt(long createAt) {
		this.createAt = createAt;
	}
	public void setUpdateAt(long updateAt) {
		this.updateAt = updateAt;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", qq=" + qq + ", type=" + type + ", time=" + time + ", school="
				+ school + ", onlineId=" + onlineId + ", wish=" + wish + ", recSenior=" + recSenior + ", createAt="
				+ createAt + ", updateAt=" + updateAt + "]";
	}
	
}