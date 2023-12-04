package autowiring.springCore;

import org.springframework.stereotype.Component;

@Component
public class Address {
	
	private int hno;
	
	private String Streetname;
	
	private String city;
	
	private int pincode;
	
	public Address() {
		
	}

	public int getHno() {
		return hno;
	}

	public void setHno(int hno) {
		this.hno = hno;
	}

	public String getStreetname() {
		return Streetname;
	}

	public void setStreetname(String streetname) {
		Streetname = streetname;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address [hno=" + hno + ", Streetname=" + Streetname + ", city=" + city + ", pincode=" + pincode + "]";
	}

	public Address(int hno, String streetname, String city, int pincode) {
		super();
		this.hno = hno;
		Streetname = streetname;
		this.city = city;
		this.pincode = pincode;
	}

	
}
