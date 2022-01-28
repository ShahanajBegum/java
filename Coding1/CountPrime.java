public class CountPrime{
public static void main(String[] args){
int count=0;
int n=30;
for(int i=20;i<=n;i++){
if(n%i==0)
System.out.println("");
else
count++;
System.out.println(count);
}
}
}