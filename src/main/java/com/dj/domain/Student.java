package com.dj.domain;

public class Student {
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", type=" + type + ", time=" + time + ", school=" + school
				+ ", onlineId=" + onlineId + ", wish=" + wish + ", recSenior=" + recSenior + ", createAt=" + createAt
				+ ", updateAt=" + updateAt + "]";
	}

	private long id;
	private String name;
	private String type;
	private long time;
	private String school;
	private int onlineId;
	private String wish;
	private String recSenior;
	private long createAt;
	private long updateAt;
	
	public Student(long id, String name, String type, long time, String school, int onlineId, String wish,
			String recSenior, long createAt, long updateAt) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.time = time;
		this.school = school;
		this.onlineId = onlineId;
		this.wish = wish;
		this.recSenior = recSenior;
		this.createAt = createAt;
		this.updateAt = updateAt;
	}

	public Student() {
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
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

	public long getTime() {
		return time;
	}

	public void setTime(long time) {
		this.time = time;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public int getOnlineId() {
		return onlineId;
	}

	public void setOnlineId(int onlineId) {
		this.onlineId = onlineId;
	}

	public String getWish() {
		return wish;
	}

	public void setWish(String wish) {
		this.wish = wish;
	}

	public String getRecSenior() {
		return recSenior;
	}

	public void setRecSenior(String recSenior) {
		this.recSenior = recSenior;
	}

	public long getCreateAt() {
		return createAt;
	}

	public void setCreateAt(long createAt) {
		this.createAt = createAt;
	}

	public long getUpdateAt() {
		return updateAt;
	}

	public void setUpdateAt(long updateAt) {
		this.updateAt = updateAt;
	}

}
