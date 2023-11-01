package oops;

public class Person {

	private String name;

	private byte age;

	private String address;

	private int idNumber;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Person(String name, byte age, String address, int idNumber) {
		
		this.name = name;
		this.age = age;
		this.address = address;
		this.idNumber = idNumber;
	}
	
	



	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", address=" + address + ", idNumber=" + idNumber + "]";
	}



	public String getName() {		//getters:-used to retrive the values
		return name;				//getters :-output methods
	}

	public void setName(String name) {//setters:-used to inject the values
		
		this.name = name;				//setters:-input methods
	}

	public byte getAge() {
		return age;
	}

	public void setAge(byte age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}
	
	

}
