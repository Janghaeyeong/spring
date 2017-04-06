package kr.co.jhta.todo.vo;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Email;

public class UserForm {
	
	@NotNull
	private String id;
	@NotNull
	private String pwd;
	private String name;
	@Pattern(regexp="\\d{3}-\\d{4}-\\d{4}")
	private String phone;
	@Email
	private String email;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "UserForm [id=" + id + ", pwd=" + pwd + ", name=" + name + ", phone=" + phone + ", email=" + email + "]";
	}
}
