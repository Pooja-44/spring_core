package autowiring_xml;

public class BankAccount 
{
   private long	accountId;
   private String accountHolderName;
   private  String accountType;
   private double accountBalance;
   
public void setAccountId(long accountId) {
	this.accountId = accountId;
}
public void setAccountHolderName(String accountHolderName) {
	this.accountHolderName = accountHolderName;
}
public void setAccountType(String accountType) {
	this.accountType = accountType;
}
public void setAccountBalance(double accountBalance) {
	this.accountBalance = accountBalance;
}
public long getAccountId() {
	return accountId;
}
public String getAccountHolderName() {
	return accountHolderName;
}
public String getAccountType() {
	return accountType;
}
public double getAccountBalance() {
	return accountBalance;
}

   
   
   
}
