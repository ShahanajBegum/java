import java.util.Scanner;
class AtmUser{
int amount;
public static void main(String[] args){
Scanner s=new Scanner();
System.out.println("enter a number");
int n=s.nextInt();
AtmUser a=new AtmUser();
switch(n){
case 1:{
 System.out.println("add balance");
 System.out.println("withdraw balance");
 System.out.println("add account_no");
 System.out.println("exit");
int b=s.nextInt();
switch(b){
case 1:{
       System.out.println("add balance");
       a.addBalance(1000.0);
       }
case 2:
       {
       System.out.println("withdraw");
       a.withDraw(500.00);
       }
case 3:
       {
       System.out.println("accountnumber");
        System.out.println(a.getAccount_no());
        
       }
case 4:System.out.println("exit");
}
}
}
}

}