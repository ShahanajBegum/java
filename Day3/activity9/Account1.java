public class Account1{
private String account_holder_name;
private long account_number;
private double balance;
 void accountDetails(){
System.out.println("account_holder_name");
System.out.println("account_number");
System.out.println("balance");
}
void setName(String account_holder_name){
this.account_holder_name=account_holder_name;
}
void setBalance(double balance){
this.balance=balance;
}
public String getName(){
return account_holder_name;
}
public double getBalance(){
 return balance;
}
public long getNumber(){
return account_number;
}
}