public class Account1{
private long acc_no;
private int ifsc;

public void setAccount_no(long a){
acc_no=a;
}
public void setIfsc(int b){
ifsc=b;
}
public long getAccount_no(){
return acc_no;
}
public int getIfsc(){
acc_no=a;
}
}


class SavingAccount1 extends Account1 {
double balance;
}
public void displayAttributes(){
System.out.println(balance);
}
public String toString(){
return "balance"
}
}

class LoanAccount1 extends Account1{
double loan_amount;
public void displayAttributes(){
System.out.println(loan_amount);
}

}