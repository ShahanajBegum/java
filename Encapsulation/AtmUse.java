class AtmUser{
int amount;
public static void main(String[] args){
Scanner s=new Scanner();
System.out.println("enter a number");
int n=s.nextInt();
switch(n){
case 1:{
 System.out.println("add balance");
 System.out.println("withdraw balance");
 System.out.println("add account_no");
 System.out.println("exit");

AtmUser a=new AtmUser();
int b=s.nextInt()
switch(n){
case 1:{
       System.out.println("add balance");
       a.addBalance(1000);
       }
case 2:
       {
       System.out.println("withdraw");
       a.withdraw(500);
       }
case 3:
       {
       System.out.println("accountnumber");
        System.out.println(a.getAccount_no);
        
       }
case 4:System.out.println("exit");
}
}
}


}