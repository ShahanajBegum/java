public class Neon{
public static void main(String[] args){
int n=9;
int sum=0;
int t=n;
do{
int r=n%10;
int d=sum*sum;
sum=sum+r;
n=n/10;
}while(n>0);
if(t==sum)
System.out.println("neon");
else
System.out.println("not neon");
}


}