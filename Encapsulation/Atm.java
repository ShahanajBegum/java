import java.util.Scanner;
public class Atm{
private long Account_no=123456789l;
private double balance=0.0;
private int password=1234;
int amount;
private String Account_holder_name="shahanaj";
public void addBalance(double balance){
if((balance%100==0)||(balance%500==0)||(balance%2000==0)){
this.balance=this.balance+balance;
}
else{
System.out.println("enter amount of 100 & 500 & 2000 ");
}
}

public double withDraw(double balance){
Scanner sc=new Scanner(System.in);
System.out.print("enter password");
int password=sc.nextInt();
if(this.password==password){

if(amount<balance){
balance=balance-amount;
System.out.println("succesfull withdraw amount");
}

else 
System.out.println("Insuficient Balance");
}
return amount;
}

public long getAccount_No(){
return Account_no;
}

public void setAccount_holder_name(String Account_holder_name){
this.Account_holder_name=Account_holder_name;
}

}