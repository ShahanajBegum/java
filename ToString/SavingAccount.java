public class SavingAccount{
long account_no;
String name;
double balance;
SavingAccount(long account_no,String name,double balance){
this.account_no=account_no;
this.name= name;
this.balance=balance;
}
public String toString(){
return "account_no" +account_no +"name"+name+"balance"+balance;
}
public static void main(String[] args){
SavingAccount s= new SavingAccount(33833306919l,"ameer",100000.00);
System.out.println(s.toString());
}

}