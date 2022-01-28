public class PrimeNumber{
public static void main(String[] args){
int n=7;
boolean b=true;
for(int i=2;i<n;i++){
if(n%i==0)
b=false;
break;
}
if(b==true)
System.out.println(n +"is a prime number");
else
System.out.println(n +"is a not prime number");


}

}