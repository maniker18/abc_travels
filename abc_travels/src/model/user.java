package model;

public class user {

	private String firstname;
	private String lastname;
	private int phonenumber;
	private String Gender;
	private String gmail;
	private String password;

	@Override
	public String toString() {
		return "user [firstname=" + firstname + ", lastname=" + lastname + ", phonenumber=" + phonenumber + ", Gender="
				+ Gender + ", gmail=" + gmail + ", password=" + password + ", failedcount=" + failedcount
				+ ", accountstatus=" + accountstatus + "]";
	}

	public user(String firstname, String lastname, int phonenumber, String gender, String gmail, String password,
			int failedcount, String accountstatus) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.phonenumber = phonenumber;
		Gender = gender;
		this.gmail = gmail;
		this.password = password;
		this.failedcount = failedcount;
		this.accountstatus = accountstatus;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(int phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public String getGmail() {
		return gmail;
	}

	public void setGmail(String gmail) {
		this.gmail = gmail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getFailedcount() {
		return failedcount;
	}

	public void setFailedcount(int failedcount) {
		this.failedcount = failedcount;
	}

	public String getAccountstatus() {
		return accountstatus;
	}

	public void setAccountstatus(String accountstatus) {
		this.accountstatus = accountstatus;
	}

	private int failedcount;
	private String accountstatus;

}
