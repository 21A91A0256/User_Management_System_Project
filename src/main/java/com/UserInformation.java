package com;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="User_Details")
public class UserInformation 
{
	@Id
	@Column(name ="User_Id")
	private int userid;
	@Column(name="User_Name",nullable = false)
	private String username;
	@Column(name="User_EmailId",unique = true,nullable=false)
	private String useremailid;
	@Column(name="Password",nullable=false)
	private String password;
	@Column(name="MobileNumber",nullable=false,unique =true)
	private long mobilenumber;
	@Column(name="Gender",nullable=false)
	private String gender;
	@Column(name="Address",nullable=false)
	private String address;
	
	public UserInformation()
	{
		
	}

	public UserInformation(int userid, String username, String useremailid, String password, long mobilenumber,
			String gender, String address) 
	{
		this.userid = userid;
		this.username = username;
		this.useremailid = useremailid;
		this.password = password;
		this.mobilenumber = mobilenumber;
		this.gender = gender;
		this.address = address;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUseremailid() {
		return useremailid;
	}

	public void setUseremailid(String useremailid) {
		this.useremailid = useremailid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getMobilenumber() {
		return mobilenumber;
	}

	public void setMobilenumber(long mobilenumber) {
		this.mobilenumber = mobilenumber;
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

	@Override
	public String toString() 
	{
		return "UserInformation [userid=" + userid + ", username=" + username + ", useremailid=" + useremailid
				+ ", password=" + password + ", mobilenumber=" + mobilenumber + ", gender=" + gender + ", address="
				+ address + "]";
	}
	
	
	
	 
	  
}
