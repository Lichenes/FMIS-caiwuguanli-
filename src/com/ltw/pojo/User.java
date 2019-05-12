package com.ltw.pojo;

public class User {
	private int uid;
	private String username;
	private String password;
	private String sex;
	private int age;
	private String brith;
	private String cardid;
	private int money;
	private String type;
	private String date;
	private String notebook;
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getBrith() {
		return brith;
	}
	public void setBrith(String brith) {
		this.brith = brith;
	}
	public String getCardid() {
		return cardid;
	}
	public void setCardid(String cardid) {
		this.cardid = cardid;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getNotebook() {
		return notebook;
	}
	public void setNotebook(String notebook) {
		this.notebook = notebook;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((brith == null) ? 0 : brith.hashCode());
		result = prime * result + ((cardid == null) ? 0 : cardid.hashCode());
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + money;
		result = prime * result + ((notebook == null) ? 0 : notebook.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((sex == null) ? 0 : sex.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result + uid;
		result = prime * result + ((username == null) ? 0 : username.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (age != other.age)
			return false;
		if (brith == null) {
			if (other.brith != null)
				return false;
		} else if (!brith.equals(other.brith))
			return false;
		if (cardid == null) {
			if (other.cardid != null)
				return false;
		} else if (!cardid.equals(other.cardid))
			return false;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (money != other.money)
			return false;
		if (notebook == null) {
			if (other.notebook != null)
				return false;
		} else if (!notebook.equals(other.notebook))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (sex == null) {
			if (other.sex != null)
				return false;
		} else if (!sex.equals(other.sex))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		if (uid != other.uid)
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "User [uid=" + uid + ", username=" + username + ", password=" + password + ", sex=" + sex + ", age="
				+ age + ", brith=" + brith + ", cardid=" + cardid + ", money=" + money + ", type=" + type + ", date="
				+ date + ", notebook=" + notebook + "]";
	}
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int uid, String username, String password, String sex, int age, String brith, String cardid, int money,
			String type, String date, String notebook) {
		super();
		this.uid = uid;
		this.username = username;
		this.password = password;
		this.sex = sex;
		this.age = age;
		this.brith = brith;
		this.cardid = cardid;
		this.money = money;
		this.type = type;
		this.date = date;
		this.notebook = notebook;
	}
	
}
