public class SumOfEvenOdd{
public static void main(String[] args){
int ed=0;
int od=0;
int n=1234;
while(n>0){
int r=n%10;
if(r%2==0)
ed=ed+r;
else
od=od+r;
n=n/10;

}
System.out.println(ed);
System.out.println(od);

}

}