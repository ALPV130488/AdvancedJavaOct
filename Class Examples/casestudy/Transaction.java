package casestudy;

import java.util.Date;

public class Transaction {

	private int accNo;
	
	private String typeOfTrans;
	
	private Date date;
	
	private float withdrawlAmount;
	
	private float depositAmount;
	
	private float balance;
	
	private int transId;

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getTypeOfTrans() {
		return typeOfTrans;
	}

	public void setTypeOfTrans(String typeOfTrans) {
		this.typeOfTrans = typeOfTrans;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public float getWithdrawlAmount() {
		return withdrawlAmount;
	}

	public void setWithdrawlAmount(float withdrawlAmount) {
		this.withdrawlAmount = withdrawlAmount;
	}

	public float getDepositAmount() {
		return depositAmount;
	}

	public void setDepositAmount(float depositAmount) {
		this.depositAmount = depositAmount;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	public int getTransId() {
		return transId;
	}

	public void setTransId(int transId) {
		this.transId = transId;
	}
	
	public Transaction() {
		// TODO Auto-generated constructor stub
	}

	public Transaction(int accNo, String typeOfTrans, Date date, float withdrawlAmount, float depositAmount,
			float balance, int transId) {
		super();
		this.accNo = accNo;
		this.typeOfTrans = typeOfTrans;
		this.date = date;
		this.withdrawlAmount = withdrawlAmount;
		this.depositAmount = depositAmount;
		this.balance = balance;
		this.transId = transId;
	}

	@Override
	public String toString() {
		return "Transaction [accNo=" + accNo + ", typeOfTrans=" + typeOfTrans + ", date=" + date + ", withdrawlAmount="
				+ withdrawlAmount + ", depositAmount=" + depositAmount + ", balance=" + balance + ", transId=" + transId
				+ "]";
	}
	
	
	
}
