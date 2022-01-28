public class StrongNumber{
public static void main(String[] args){
int sum=0;
int n=145;
int t=n;
while(n>0){
int r=n%10;
int f=1;
while(r>1){
f=f*r;
r--;
}
sum=sum+f;
n=n/10;
}
if(t==sum)
System.out.println("strong number");
else
System.out.println("not a strong number");

}}