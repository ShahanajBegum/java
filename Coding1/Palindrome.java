public class Palindrome{
public static void main(String[] args){
int rev=0;
int n=143;
int t=n;
while(n>0){
int r=n%10;
rev=rev*10+r;
n=n/10;
}
if(t==n)
System.out.println("palindrome");
else
System.out.println("palindrome");
}
}

