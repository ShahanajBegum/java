public class Account
{
private String account_holder_name;
private long account_no;
private double bal;
public void setHolderName(){
this.account_holder_name=account_holder_name;
Branch b=new Branch();
}
public long getAccountNumber(){
return account_no;
}
public void setBal(){
this.bal=bal;
}
public double getBal(){
if(bal>o)
return bal;
else
System.out.println("insufficient balance");
}
public void accountDetails(){
System.out.println("account holder name"+ "  " +account_holder_name);
System.out.println("account account_no"+" " +account_no);
System.out.println("account balance"+ " " +bal);
}
//Account(String account_holder_name,long account_no,double bal){
this.account_holder_name=account_holder_name;
this.account_no=account_no;
this.bal=bal;
}//
public static void main(String[] args){
Account a=new Account(new Branch());
a.b.createAccount();
a.b.branchAttributes();
a.b.manager_name="ameer";
a.b.ifsc="12456SBi";
System.out.println(a.b.getManagerName());
System.out.println(a.b.getIfsc());
a.b.createAccount();
a.accountDetails();
System.out.println(a.getBal());


}
}

