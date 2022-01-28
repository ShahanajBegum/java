public class FactorialWhile{
public static void main(String[]args){
int n=1234;
int sum=1;
while(n>0){
int r=n%10;
int f=1;
if(r%2==0){
while(r>1){
f=f*r;
r--;
}
sum=sum*f;
}
System.out.println(sum);
n=n/10;
}
//System.out.println(sum);
}//System.out.println(sum);

}
