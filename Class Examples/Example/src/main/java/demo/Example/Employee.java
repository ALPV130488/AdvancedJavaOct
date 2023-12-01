package demo.Example;

public class Employee {
	
	private String empname;
	
	private int empid;
	
	private String empadd;
	
	private int empsal;
	
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

	public String getEmpadd() {
		return empadd;
	}

	public void setEmpadd(String empadd) {
		this.empadd = empadd;
	}

	public int getEmpsal() {
		return empsal;
	}

	public void setEmpsal(int empsal) {
		this.empsal = empsal;
	}

	public Employee(String empname, int empid, String empadd, int empsal) {
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
