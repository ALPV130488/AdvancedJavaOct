package casestudy;

public class Account {
	
	private long accNo;
	
	private String accHolderName;
	
	private long contactNo;
	
	private String typeOfAccount;
	
	private float accBalance;
	
	
	public Account() {
		// TODO Auto-generated constructor stub
	}


	public long getAccNo() {
		return accNo;
	}


	public void setAccNo(long accNo) {
		this.accNo = accNo;
	}


	public String getAccHolderName() {
		return accHolderName;
	}


	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}


	public long getContactNo() {
		return contactNo;
	}


	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}


	public String getTypeOfAccount() {
		return typeOfAccount;
	}


	public void setTypeOfAccount(String typeOfAccount) {
		this.typeOfAccount = typeOfAccount;
	}


	public float getAccBalance() {
		return accBalance;
	}


	public void setAccBalance(float accBalance) {
		this.accBalance = accBalance;
	}


	public Account(long accNo, String accHolderName, long contactNo, String typeOfAccount, float accBalance) {
		super();
		this.accNo = accNo;
		this.accHolderName = accHolderName;
		this.contactNo = contactNo;
		this.typeOfAccount = typeOfAccount;
		this.accBalance = accBalance;
	}


	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", accHolderName=" + accHolderName + ", contactNo=" + contactNo
				+ ", typeOfAccount=" + typeOfAccount + ", accBalance=" + accBalance + "]";
	}

	
	
}
