package in.java.bean;

import java.io.Serializable;

//right click on ↓ this student to copy qualified name
@SuppressWarnings("serial")
public class Student implements Serializable{
	
	static {
		System.out.println("Student.class file is loading..");
	}
	
	//Primitive Types
	private Integer sid;
	private String sname;
	private String saddress;
	private Integer sage;
	
	public Student() {
		System.out.println("Used By Spring Framework");
	}
	
	public Integer getSid() {
		return sid;
	}



	public void setSid(Integer sid) {
		this.sid = sid;
		System.out.println("Student.setSid()");
	}



	public String getSname() {
		return sname;
	}



	public void setSname(String sname) {
		this.sname = sname;
		System.out.println("Student.setSname()");

	}



	public String getSaddress() {
		return saddress;
	}



	public void setSaddress(String saddress) {
		this.saddress = saddress;
		System.out.println("Student.setSaddress()");

	}



	public Integer getSage() {
		return sage;
	}



	public void setSage(Integer sage) {
		this.sage = sage;
		System.out.println("Student.setSage()");

	}



	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", saddress=" + saddress + ", sage=" + sage + "]";
	}

}
