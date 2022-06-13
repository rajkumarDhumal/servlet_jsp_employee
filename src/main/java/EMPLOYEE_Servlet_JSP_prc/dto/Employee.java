package EMPLOYEE_Servlet_JSP_prc.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	private int id;
	private String name;
	private long pno;
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
	public long getPno() {
		return pno;
	}
	public void setPno(long pno) {
		this.pno = pno;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", pno=" + pno + "]";
	}
	
	
	
}
