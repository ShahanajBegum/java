public class CountEvenOddFactors{
public static void main(String[] args){
int counteven=0;
int countodd=0;
int n=6;
for(int i=1;i<=n;i++){
if(n%i==0){
if(i%2==0)
counteven++;
}
else
countodd++;
}
System.out.println(counteven);
System.out.println(countodd);
}
}
