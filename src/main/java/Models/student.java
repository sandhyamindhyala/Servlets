package Models;

public class student {
	
	private int id;
	
	private String name;
	
	private String branch;
	
	private String email;
	
	private String password;
	
	private long phonenum;

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

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
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

	public long getPhonenum() {
		return phonenum;
	}

	public void setPhonenum(long phonenum) {
		this.phonenum = phonenum;
	}

	public student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public student(int id, String name, String branch, String email, String password, long phonenum) {
		super();
		this.id = id;
		this.name = name;
		this.branch = branch;
		this.email = email;
		this.password = password;
		this.phonenum = phonenum;
	}
	
	
	

}
