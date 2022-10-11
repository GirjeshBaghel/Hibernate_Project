package net.Girjesh.hibernet;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Demo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String u_fname;
	private String u_ltname;
	private String u_dob;
	private String u_age;
	private String u_gender;
	private String u_email;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getU_fname() {
		return u_fname;
	}
	public void setU_fname(String u_fname) {
		this.u_fname = u_fname;
	}
	public String getU_ltname() {
		return u_ltname;
	}
	public void setU_ltname(String u_ltname) {
		this.u_ltname = u_ltname;
	}
	public String getU_dob() {
		return u_dob;
	}
	public void setU_dob(String u_dob) {
		this.u_dob = u_dob;
	}
	public String getU_age() {
		return u_age;
	}
	public void setU_age(String u_age) {
		this.u_age = u_age;
	}
	public String getU_gender() {
		return u_gender;
	}
	public void setU_gender(String u_gender) {
		this.u_gender = u_gender;
	}
	public String getU_email() {
		return u_email;
	}
	public void setU_email(String u_email) {
		this.u_email = u_email;
	}
	@Override
	public String toString() {
		return "Demo [id=" + id + ", u_fname=" + u_fname + ", u_ltname=" + u_ltname + ", u_dob=" + u_dob + ", u_age="
				+ u_age + ", u_gender=" + u_gender + ", u_email=" + u_email + "]";
	}
	public Demo(String u_fname, String u_ltname, String u_dob, String u_age, String u_gender, String u_email) {
		super();
		this.u_fname = u_fname;
		this.u_ltname = u_ltname;
		this.u_dob = u_dob;
		this.u_age = u_age;
		this.u_gender = u_gender;
		this.u_email = u_email;
	}
	public Demo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}