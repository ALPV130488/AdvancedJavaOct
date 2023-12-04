package autowiring.springCore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("emp")			//obj creation
public class Employee {

	private String empname;

	private int empid;

	private int empsal;
	
	@Autowired
	private Address empadd;
	
	

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public Address getEmpadd() {
		return empadd;
	}

	public void setEmpadd(Address empadd) {
		this.empadd = empadd;
	}

	public int getEmpsal() {
		return empsal;
	}

	public void setEmpsal(int empsal) {
		this.empsal = empsal;
	}

	public Employee(String empname, int empid, Address empadd, int empsal) {
		this.empname = empname;
		this.empid = empid;
		this.empadd = empadd;
		this.empsal = empsal;
	}

	@Override
	public String toString() {
		return "Employee [empname=" + empname + ", empid=" + empid + ", empadd=" + empadd + ", empsal=" + empsal + "]";
	}

}
